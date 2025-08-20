/*
Desenvolva um programa que solicite tr�s notas de provas de um aluno e apresente
na tela a m�dia dessas notas. A obten��o das notas deve ser realizada na fun��o
principal e o c�lculo da m�dia das notas deve ser obtido por outra fun��o
(MEDIA). Para o c�lculo da m�dia considere que a primeira prova tem peso 1 e
as outras duas provas possuem peso 2.
*/

#include <stdio.h>
#include <stdlib.h>

double mediaNotas(double p1, double p2, double p3);

int main()
{
    float n1, n2, n3;
    float media;

    printf("Digite a nota da p1: ");
    scanf("%f", &n1);

    printf("Digite a nota da p2: ");
    scanf("%f", &n2);

    printf("Digite a nota da p3: ");
    scanf("%f", &n3);

    media = mediaNotas(n1, n2, n3);

    printf("Aluno com notas %.2f, %.2f e %.2f tem a media %.2f", n1, n2, n3, media);

    return 0;
}

double mediaNotas(double p1, double p2, double p3){
    return (p1 + (p2 * 2 )+ (p3 * 2))/ 5;
}
