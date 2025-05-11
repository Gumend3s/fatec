#include <stdio.h>
#include <stdlib.h>

void fillValues(int vet[], int vsize);
int search(int vet[], int vsize, int key, int positions[]);
void insertion_sort(int vet[], int size);

int main()
{
    int vsize;

    printf("Digite quantos numeros serao inseridos: ");
    scanf("%d", &vsize);

    int vet[vsize];
    system("cls");
    fillValues(vet, vsize);

    insertion_sort(vet, vsize);

    int key, positions[vsize];

    system("cls");
    printf("Digite qual numero sera pesquisado: ");
    scanf("%d", &key);

    int keyCount = search(vet, vsize, key, positions), i;

    system("cls");
    if(!keyCount) printf("Numero nao presente no vetor passado");
    else
    {
        printf("O numero %d foi encontrador %d vezes, no vetor ordenado as posicoes sao:\n", key, keyCount);
        for(i = 0; i < keyCount; i++)
        {
            if(i) printf(", ");
            printf("%d", positions[i]);
        }
    }

    return 0;
}

void fillValues(int vet[], int vsize)
{
    int i;
    printf("Inserindo no vetor\n");
    for(i = 0; i < vsize; i++)
    {
        printf("Registro %d: ", i + 1);
        scanf("%d", &vet[i]);
    }
}

int search(int vet[], int vsize, int key, int positions[])
{
    int start = 0, end = vsize - 1, middle = (start + end) / 2;

    while(start != end)
    {
        if(vet[middle] == key) break;
        else if(vet[middle] < key)
        {
            start = middle + 1;
        } else if(vet[middle] > key)
        {
            end = middle - 1;
        }
        middle = (start + end) / 2;
    }

    start = middle;
    while(vet[start - 1] == key) start--;

    end = middle;
    while(vet[end + 1] == key) end++;

    int i;
    middle = end - start;

    for(i = 0; i <= middle; i++)
    {
        positions[i] = i + start;
    }

    return i;
}

void insertion_sort(int vet[], int vsize)
{
    int i, j, aux;

    for(i = 1; i < vsize; i++)
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
