/*
Desenvolva um programa em C que declare duas variáveis do tipo inteiro e duas
do tipo ponteiro de inteiro apontando para essas variáveis. Utilizando ponteiros, o
programa deve ler dois números para essas variáveis e os imprimir, realizando as
quatro operações básicas de matemática com esses números.
*/
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n1, n2;
    int *p1, *p2;

    // Ponteiros apontam para as variáveis
    p1 = &n1;
    p2 = &n2;

    // Entrada de dados
    printf("Digite um numero: ");
    scanf("%d", p1);  // já é endereço

    printf("Digite outro numero: ");
    scanf("%d", p2);

    // Operações usando *p1 e *p2
    printf("Soma: %d + %d = %d\n", n1, n2, n1 + n2);
    printf("Subtracao: %d - %d = %d\n", n1, n2, n1 - n2);
    printf("Multiplicacao: %d * %d = %d\n", n1, n2, n1 * n2);

    // Divisão com verificação de divisão por zero
    if (*p2 != 0)
        printf("Divisao: %d / %d = %d\n", n1, n2, n1 / n2);
    else
        printf("Divisao por zero nao e permitida.\n");

    return 0;
}

