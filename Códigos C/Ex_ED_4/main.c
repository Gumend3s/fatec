/*
Desenvolva um programa em C que declare duas vari�veis do tipo inteiro e duas
do tipo ponteiro de inteiro apontando para essas vari�veis. Utilizando ponteiros, o
programa deve ler dois n�meros para essas vari�veis e os imprimir, realizando as
quatro opera��es b�sicas de matem�tica com esses n�meros.
*/
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n1, n2;
    int *p1, *p2;

    // Ponteiros apontam para as vari�veis
    p1 = &n1;
    p2 = &n2;

    // Entrada de dados
    printf("Digite um numero: ");
    scanf("%d", p1);  // j� � endere�o

    printf("Digite outro numero: ");
    scanf("%d", p2);

    // Opera��es usando *p1 e *p2
    printf("Soma: %d + %d = %d\n", n1, n2, n1 + n2);
    printf("Subtracao: %d - %d = %d\n", n1, n2, n1 - n2);
    printf("Multiplicacao: %d * %d = %d\n", n1, n2, n1 * n2);

    // Divis�o com verifica��o de divis�o por zero
    if (*p2 != 0)
        printf("Divisao: %d / %d = %d\n", n1, n2, n1 / n2);
    else
        printf("Divisao por zero nao e permitida.\n");

    return 0;
}

