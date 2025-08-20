/*
Escreva um programa que solicite dois números ao usuário e apresente na tela o
resultado da soma do módulo desses números. Esse programa deve possuir uma
função para calcular o módulo.
*/

#include <stdio.h>
#include <stdlib.h>

int somaModulo(int n1, int n2);


int main()

{
    int n1, n2, resultado;


    printf("Digite o primeiro numero: ");
    scanf("%d", &n1);

    printf("Digite o segundo numero: ");
    scanf("%d", &n2);

    resultado = somaModulo(n1, n2);

    printf("A soma dos modulos |%d| + |%d| = %d ", n1, n2, resultado);

    return 0;
}

int somaModulo(int n1, int n2){
    if(n1 < 0){
        n1 = n1 * (-1);
    }
    if(n2 < 0){
        n2 = n2 * (-1);
    }

    return n1 + n2;
}
