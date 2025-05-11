#include <stdio.h>
#include <stdlib.h>

#define MAX 10

void insertion_sort(int vet[], int size);

int main()
{
    int i, vet[] = {2, 7, 5, 9, 1, 4, 8, 3, 0, 6};

    insertion_sort(vet, MAX);

    for(i = 0; i < MAX; i++)
    {
        printf("%d, ", vet[i]);
    }

    return 0;
}

void insertion_sort(int vet[], int size)
{
    int i, j, aux;

    for(i = 1; i < size; i++)
    {
        for(j = i; j > 0; j--)
        {
            if(vet[j] < vet[j-1])
            {
                aux = vet[j];

                while(vet[j-1] > aux)
                {
                    vet[j] = vet[j-1];
                    j--;
                }

                vet[j] = aux;

                break;
            }
            else break;
        }
    }
}
