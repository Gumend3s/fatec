#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define BOARD_SIZE 10
#define STARTING_ENEMIES 3
#define MAX_ENEMIES 10
#define RESTRICTED_RANGE 1
#define MIN_ENEMY_COOLDOWN 0
#define MAX_ENEMY_COOLDOWN 1

int board[BOARD_SIZE][BOARD_SIZE], enemies[MAX_ENEMIES][2], cooldown_enemy[MAX_ENEMIES], playerX, playerY, enemy_count;
int main()
{
    int i, error = 0, attack, j;
    char move;

    start_game();
    print_screen();

    for(;;)
    {
        do
        {
            attack = 0;
            print_screen(error);
            printf("Digite o proximo movimento: ");
            scanf("%d", &attack);
            scanf("%c", &move);
            while(getchar() != '\n');
            if(!attack)
            {
                error = move_player(move);
            } else
            {
                error = player_attack(move);
            }
        }while(error);
        if(move_enemies()) break;
        if(!(i%2)) spawn_enemie();
        i++;
    }
    print_screen(error);
    printf("Perdeu o jogo");
    for(;;) scanf("");
    return 0;
}

/*
    Generates random numbers
    Receives a range for the number generation
    Ex: receiving 20, generates numbers between 1-19, that being a total of 20 possible numbers
    Utilizes the time() function to get a discriminant for the number generation to not follow a
    predictable pattern
*/
int random_number(int range)
{
    int seed = time(0) % 1000, rnumber;
    do rnumber = rand() * rand(); while(rnumber < 99999999 || rnumber > 999999999);
    return (rnumber / seed) % range;
}

/*
    Returns a number without is sign(+ or -)
*/
int unsign_number(int number)
{
    if(number < 0) return number * -1;
    return number;
}

/*
    Starts the game, ensuring that all necessary variables are reseted
    Chooses a random place for the player to start and spawns the starting amount of enemies
*/
void start_game()
{
    int i, j;
    for(i = 0; i < BOARD_SIZE; i++)
    {
        for(j = 0; j < BOARD_SIZE; j++)
        {
            board[i][j] = 0;
        }
    }
    playerX = random_number(BOARD_SIZE);
    playerY = random_number(BOARD_SIZE);
    board[playerX][playerY] = 1;

    for(i = 0; i < MAX_ENEMIES; i++)
    {
        enemies[i][0] = -1;
        enemies[i][1] = -1;
    }

    for(i = 0; i < STARTING_ENEMIES; i++) spawn_enemie();
}

/*
    Prints the map on the screen
    Can receive a value representing an error code to show the player an invalid movement
*/
void print_screen(int error)
{
    system("cls");
    int i, j, l;
    for(i = 0; i < BOARD_SIZE; i++)
    {
        for(j = 0; j < BOARD_SIZE; j++)
        {
            switch (board[i][j])
            {
            case 1:
                printf("O");
                break;
            case 2:
                for(l = 0; l < MAX_ENEMIES; l++)
                {
                    if(enemies[l][0] == i && enemies[l][1] == j)
                    {
                        printf("%d", cooldown_enemy[l]);
                        break;
                    }
                }
                break;
            case 3:
                printf("#");
                board[i][j] = 0;
                break;
            default:
                printf("#");
            }
        }
        printf("\n");
    }

    switch(error)
    {
    case 1:
        printf("Movimento invalido, limite do mapa atingido!\n");
        break;
    case 2:
        printf("Movimento invalido, inimigo no caminho!\n");
        break;
    default:
        break;
    }
}

int add_enemy_cooldown()
{
    return random_number(MAX_ENEMY_COOLDOWN - MIN_ENEMY_COOLDOWN + 1) + MIN_ENEMY_COOLDOWN;
}

/*
    Spawns a new enemy on a random place on the map
    Can't spawn past the enemy limit, where other enemies are placed and in an close
    area to the player
    */
void spawn_enemie()
{
    if (enemy_count >= MAX_ENEMIES) return;

    int newX, newY, i;

    for(i = 0; i < MAX_ENEMIES; i++)
    {
        if(enemies[i][0] == -1)
        {

            do
            {
                newX = random_number(BOARD_SIZE);
                newY = random_number(BOARD_SIZE);
            } while(newX <= playerX + RESTRICTED_RANGE &&
                    newX >= playerX - RESTRICTED_RANGE &&
                    newY <= playerY + RESTRICTED_RANGE &&
                    newY >= playerY - RESTRICTED_RANGE ||
                    board[newX][newY] != 0);

            enemies[i][0] = newX;
            enemies[i][1] = newY;
            board[newX][newY] = 2;
            enemy_count++;
            cooldown_enemy[i] = add_enemy_cooldown();
            break;
        }
    }
}

/*
    Remove an enemy from the map on the coordinates passed
*/
void kill_enemy(int enemyX, int enemyY)
{
    int i;
    for(i = 0; i < MAX_ENEMIES; i++)
    {
        if(enemies[i][0] == enemyX && enemies[i][1] == enemyY)
        {
            enemies[i][0] = -1;
            enemies[i][1] = -1;
            board[enemyX][enemyY] = 0;
            enemy_count--;
            break;
        }
    }
}

/*
    Moves the player on the received direction
    Returns an error code when the player is trying to walk out of bounds or in
    the spot of an enemy
*/
int move_player(int move)
{
    switch(move)
    {
    case 'w': //up
        if(playerX == 0) return 1;
        if(board[playerX-1][playerY] != 0) return 2;
        board[playerX][playerY] = 0;
        playerX--;
        break;
    case 'a': //left
        if(playerY == 0) return 1;
        if(board[playerX][playerY-1] != 0) return 2;
        board[playerX][playerY] = 0;
        playerY--;
        break;
    case 's': //down
        if(playerX == BOARD_SIZE - 1) return 1;
        if(board[playerX+1][playerY] != 0) return 2;
        board[playerX][playerY] = 0;
        playerX++;
        break;
    case 'd': //right
        if(playerY == BOARD_SIZE - 1) return 1;
        if(board[playerX][playerY+1] != 0) return 2;
        board[playerX][playerY] = 0;
        playerY++;
        break;
    default:
        break;
    }
    board[playerX][playerY] = 1;
    return 0;
}

/*
    Makes an player attack on the received direction
    Returns an error when the player tries to attack out of bounds
    The attack stays on the map until a enemy moves into it or the mapa is printed
*/
int player_attack(int direction)
{
    switch(direction)
    {
    case 'w': //up
        if(playerX == 0) return 1;
        if(board[playerX-1][playerY] == 2) kill_enemy(playerX-1, playerY);
        else board[playerX-1][playerY] = 3;
        break;
    case 'a': //left
        if(playerY == 0) return 1;
        if(board[playerX][playerY-1] == 2) kill_enemy(playerX, playerY-1);
        else board[playerX][playerY-1] = 3;
        break;
    case 's': //down
        if(playerX == BOARD_SIZE - 1) return 1;
        if(board[playerX+1][playerY] == 2) kill_enemy(playerX+1, playerY);
        else board[playerX+1][playerY] = 3;
        break;
    case 'd': //right
        if(playerY == BOARD_SIZE - 1) return 1;
        if(board[playerX][playerY+1] == 2) kill_enemy(playerX, playerY+1);
        else board[playerX][playerY+1] = 3;
        break;
    default:
        break;
    }
    return 0;
}

/*
    Move all enemiues one step closer to the player
    The prioritized direction is the one that the enemies if farther from the player
    making for an more aggressive enemy approach
*/
int move_enemies()
{
    int i, distanceX, distanceY;
    for(i = 0; i < MAX_ENEMIES; i++)
    {
        if(enemies[i][0] != -1)
        {
            if(cooldown_enemy[i] > 0)
            {
                cooldown_enemy[i] -= 1;
            } else {
                distanceX = enemies[i][0] - playerX;
                distanceY = enemies[i][1] - playerY;

                if(unsign_number(distanceX) != unsign_number(distanceY))
                {
                    if(unsign_number(distanceX) < unsign_number(distanceY))
                    {
                        if(move_enemy(i, 1, distanceY / unsign_number(distanceY))) return 3;
                    } else
                    {
                        if(move_enemy(i, 0, distanceX / unsign_number(distanceX))) return 3;
                    }
                } else if(random_number(2))
                {
                    if(move_enemy(i, 1, distanceY / unsign_number(distanceY))) return 3;
                } else
                {
                    if(move_enemy(i, 0, distanceX / unsign_number(distanceX))) return 3;
                }
                cooldown_enemy[i] = add_enemy_cooldown();
            }
        }
    }
    return 0;
}

/*
    Moves the enemy with the received ID on the axis an distance passed
    X axis: 0, plus is right and minus is left
    Y axis: 1, plus is down and minus is up
*/
int move_enemy(int enemyID, int moveAxis, int distance)
{
    int new_position[2];
    new_position[moveAxis] = enemies[enemyID][moveAxis] - distance;
    new_position[!moveAxis] = enemies[enemyID][!moveAxis];

    if(board[new_position[0]][new_position[1]] == 0)
    {
        board[enemies[enemyID][0]][enemies[enemyID][1]] = 0;
        board[new_position[0]][new_position[1]] = 2;
        enemies[enemyID][0] = new_position[0];
        enemies[enemyID][1] = new_position[1];
    }
    if(board[new_position[0]][new_position[1]] == 1) return 1;
    if(board[new_position[0]][new_position[1]] == 3)
    {
        kill_enemy(enemies[enemyID][0], enemies[enemyID][1]);
        board[new_position[0]][new_position[1]] == 0;
    }
    return 0;
}
