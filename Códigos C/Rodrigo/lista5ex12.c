#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define N 9

int valido(int tab[N][N], int linha, int coluna, int num);
void embaralhar(int vetor[]);
int gerarSudoku(int tab[N][N], int linha, int coluna);
void imprimir(int tab[N][N]);
int solucao(int mat[9][9]);

int main() {
    srand(time(NULL));
    int sudoku[N][N] = {0};
    gerarSudoku(sudoku, 0, 0);

    printf("Sudoku gerado:\n\n");
    imprimir(sudoku);

    if (solucao(sudoku))
        printf("\nA matriz e uma solucao valida!\n");
    else
        printf("\nA matriz NAO e uma solucao valida!\n");

    return 0;
}

int valido(int tab[N][N], int linha, int coluna, int num) {
    int i, j;

    // Linha
    for (i = 0; i < N; i++)
        if (tab[linha][i] == num)
            return 0;

    // Coluna
    for (i = 0; i < N; i++)
        if (tab[i][coluna] == num)
            return 0;

    // Bloco 3x3
    int inicioLinha = linha - linha % 3;
    int inicioColuna = coluna - coluna % 3;

    for (i = 0; i < 3; i++)
        for (j = 0; j < 3; j++)
            if (tab[inicioLinha + i][inicioColuna + j] == num)
                return 0;

    return 1;
}

void embaralhar(int vetor[]) {
    int i;

    for (i = 0; i < N; i++)
        vetor[i] = i + 1;
    for (i = N - 1; i > 0; i--) {
        int j = rand() % (i + 1);
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}

int gerarSudoku(int tab[N][N], int linha, int coluna) {

    if (linha == N)
        return 1;
    if (coluna == N)
        return gerarSudoku(tab, linha + 1, 0);

    int numeros[N];
    embaralhar(numeros);
    int i;

    for (i = 0; i < N; i++) {
        int num = numeros[i];
        if (valido(tab, linha, coluna, num)) {
            tab[linha][coluna] = num;
            if (gerarSudoku(tab, linha, coluna + 1))
                return 1;

            tab[linha][coluna] = 0;
        }
    }

    return 0;
}

void imprimir(int tab[N][N]) {
    int i, j;

    for (i = 0; i < N; i++) {
        if (i % 3 == 0)
            printf("+-------+-------+-------+\n");
        for (j = 0; j < N; j++) {
            if (j % 3 == 0)
                printf("| ");
            printf("%d ", tab[i][j]);
        }
        printf("|\n");
    }
    printf("+-------+-------+-------+\n");
}

int solucao(int mat[9][9]) {
    int usado[10];
    int i, j, k;

    // Verifica linhas
    for (i = 0; i < 9; i++) {
        for (k = 1; k <= 9; k++)
            usado[k] = 0;
        for (j = 0; j < 9; j++) {
            if (mat[i][j] < 1 || mat[i][j] > 9)
                return 0;
            if (usado[mat[i][j]])
                return 0;
            usado[mat[i][j]] = 1;
        }
    }

    // Verifica colunas
    for (j = 0; j < 9; j++) {
        for (k = 1; k <= 9; k++)
            usado[k] = 0;
        for (i = 0; i < 9; i++) {
            if (usado[mat[i][j]])
                return 0;
            usado[mat[i][j]] = 1;
        }
    }

    // Verifica blocos 3x3
    int linha, coluna;
    for (linha = 0; linha < 9; linha += 3) {
        for (coluna = 0; coluna < 9; coluna += 3) {
            for (k = 1; k <= 9; k++)
                usado[k] = 0;
            for (i = linha; i < linha + 3; i++) {
                for (j = coluna; j < coluna + 3; j++) {
                    if (usado[mat[i][j]])
                        return 0;
                    usado[mat[i][j]] = 1;
                }
            }
        }
    }

    return 1;
}
