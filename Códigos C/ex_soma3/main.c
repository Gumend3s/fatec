#include <stdio.h>
#include <stdlib.h>

typedef struct Numeros{
    int vet[3], res;
} Numeros;

void leRegistros(int vet[3]);

int main()
{
    Numeros teste;
    int i;

    leRegistros(teste.vet);
    teste.res = 0;
    for(i = 0; i < 3; i++)
    {
        teste.res += teste.vet[i];
        printf("\nVet posicao %d: %d", i+1, teste.vet[i]);
    }

    printf("\nResultado soma: %d", teste.res);

    return 0;
}

void leRegistros(int vet[3])
{
    int i;
    for(i = 0; i < 3; i++)
    {
        printf("Digite o %d numero: ", i+1);
        scanf("%d", &vet[i]);
    }
}
