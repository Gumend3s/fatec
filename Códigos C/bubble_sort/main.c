#include <stdio.h>
#include <stdlib.h>

#define TAM 10

int main()
{
    int i, vet[] = {2, 7, 3, 4, 1, 8, 6, 9, 0, 5};

    bubbleSort(vet, TAM);

    for(i = 0; i < TAM; i++)
    {
        printf("\n%d", vet[i]);
    }

    return 0;
}

void bubbleSort(int vet[],int tam){
    int i, j;
    for(i = tam - 1; i > 0; i--){
        for(j = 0; j < i ; j++)
            if(vet[j]>vet[j+1])
                troca(&vet[j], &vet[j+1]);
    }
}

void troca(int *x, int *y)
{
    int aux;

    aux = *x;
    *x = *y;
    *y = aux;
}
