#include <stdio.h>
#include <stdlib.h>

#define MAX 10

int binary_search(int x, int vet[], int size);
void insertion_sort(int vet[], int size);

int main()
{
    int i, vet[] = {2, 7, 5, 9, 1, 4, 8, 3, 0, 6};

    insertion_sort(vet, MAX);

    printf("%d", binary_search(2, vet, 10));

    return 0;
}

int binary_search(int x, int vet[], int size)
{
    int start = 0, end = size - 1, middle = (start + end) / 2;

    while(start != end)
    {
        if(vet[middle] == x) break;
        else if(vet[middle] < x)
        {
            start = middle + 1;
        } else if(vet[middle] > x)
        {
            end = middle - 1;
        }
        middle = (start + end) / 2;
    }

    return vet[middle] == x;
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
