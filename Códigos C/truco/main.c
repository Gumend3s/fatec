#include <stdio.h>
#include <stdlib.h>

typedef struct Card{
    int rank;// 0|1|2|3|4|5|6|7|8|9    4|5|6|7|Q|J|K|A|2|3
    int suit;// 0|1|2|3   D|S|H|C   Diamonds|Spades|Hearts|Clubs
    int onHand;
} Card;

int random_number(int min, int max);
void reset_deck(int deck[10][4]);
Card pick_card();
void shuffle_cards(int deck[10][4], Card player1[3], Card player2[3], Card middle);
int compare_cards(Card card1, Card card2);
void print_card(Card c);
void print_hand(Card hand[3], int player_number);

int main()
{
    int i, j;
    Card player1[3], player2[3], middle;
    int deck[10][4];

    reset_deck(deck);
    shuffle_cards(deck, player1, player2, middle);
    print_hand(player1, 1);
    printf("\n\n");
    print_hand(player2, 0);

    return 0;
}

int random_number(int min, int max)
{
    if(min > max) return 0;
    int seed = (time(0) % 999) +1, rnumber;
    do rnumber = rand() * rand(); while(rnumber < 99999999 || rnumber > 999999999);
    return ((rnumber / seed) % (max - min + 1)) + min;
}

void reset_deck(int deck[10][4])
{
    int i, j;

    for(i = 0; i < 10; i++)
    {
        for(j = 0; j < 4; j++)
        {
            deck[i][j] = 0;
        }
    }
}

Card pick_card()
{
    Card c;

    c.rank = random_number(0, 9);
    c.suit = random_number(0, 3);

    return c;
}

void shuffle_cards(int deck[10][4], Card player1[3], Card player2[3], Card middle)
{
    int i;
    Card c;
    middle = pick_card();
    deck[middle.rank][middle.suit] = 3;

    for(i = 0; i < 3; i++)
    {
        do c = pick_card(); while(deck[c.rank][c.suit] != 0);
        player1[i] = c;
        player1[i].onHand = 1;
        deck[c.rank][c.suit] = 1;

        do c = pick_card(); while(deck[c.rank][c.suit] != 0);
        player2[i] = c;
        player2[i].onHand = 1;
        deck[c.rank][c.suit] = 2;
    }
}

int compare_cards(Card card1, Card card2)
{
    return (card1.rank == card2.rank && card1.suit == card2.suit);
}

void print_card(Card c)
{
    switch(c.rank)
    {
    case 0:
        printf("Quatro");
        break;
    case 1:
        printf("Cinco");
        break;
    case 2:
        printf("Seis");
        break;
    case 3:
        printf("Sete");
        break;
    case 4:
        printf("Dama");
        break;
    case 5:
        printf("Valete");
        break;
    case 6:
        printf("Rei");
        break;
    case 7:
        printf("As");
        break;
    case 8:
        printf("Dois");
        break;
    case 9:
        printf("Tres");
        break;
    }

    printf(" de ");

    switch(c.suit)
    {
    case 0:
        printf("Ouros");
        break;
    case 1:
        printf("Espadas");
        break;
    case 2:
        printf("Copas");
        break;
    case 3:
        printf("Paus");
        break;
    }
}

void print_hand(Card hand[3], int player)
{
    int i, j = 1;
    if(player) printf("Nois");
    else printf("Eles");

    for(i = 0; i < 3; i++)
    {
        if(hand[i].onHand)
        {
            printf("\n[%d] - ", j);
            print_card(hand[i]);
            j++;
        }
    }
}
