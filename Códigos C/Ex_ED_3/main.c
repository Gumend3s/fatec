#include <stdio.h>
#include <stdlib.h>

int dobro(int n);
int soma(int n1, int n2);
int triplo(int n);

int main()
{
    int n1, n2;
    int resultado_dobro1, resultado_dobro2;
    int soma_dobros;
    int resultado_final;

    // Entrada dos números
    printf("Digite o primeiro numero: ");
    scanf("%d", &n1);

    printf("Digite o segundo numero: ");
    scanf("%d", &n2);

    // Dobrar cada número
    resultado_dobro1 = dobro(n1);
    resultado_dobro2 = dobro(n2);
    printf("O dobro de %d = %d e o dobro de %d = %d\n", n1, resultado_dobro1, n2, resultado_dobro2);

    // Somar os valores dobrados
    soma_dobros = soma(resultado_dobro1, resultado_dobro2);
    printf("A soma dos valores dobrados e: %d\n", soma_dobros);

    // Triplicar a soma
    resultado_final = triplo(soma_dobros);

    // Mostrar resultado final
    printf("O resultado final, que e o triplo da soma, e: %d\n", resultado_final);

    return 0;
}

int dobro(int n){
    return n * 2;
}

int soma(int n1, int n2){
    return n1 + n2;
}

int triplo(int n){
    return n * 3;
}
