//Gustavo Mendes Oliveira - 2760482421030

#include <stdio.h>
#include <stdlib.h>

double media(double vet[], int n, int *i);
int binary_search(double x, double vet[], int size);
void insertion_sort(double vet[], int size);

int main()
{
    int i, qtd;
    double med;

    printf("Digite quantos numeros serao digitados: ");
    scanf("%d", &qtd);
    double vet[qtd];

    fill_vet(vet, qtd);

    insertion_sort(vet, qtd);

    system("cls");
    med = media(vet, qtd, &i);
    printf("Vetor inserido ordenado:");
    print_vet(vet, qtd);
    printf("\n\nmedia: %.2lf, ", med);
    if(vet[i] == med) printf("encontrado no registro: %d", i);
    else printf("registro mais proximo: %d", i);

    return 0;
}

double media(double vet[], int n, int *i)
{
    int j, pos;
    double soma = 0.0, media;
    for(j = 0; j < n; j++)
    {
        soma += vet[j];
    }
    media = soma / n;
    *i = binary_search(media, vet, n) + 1;
    return media;
}

int binary_search(double x, double vet[], int size)
{
    int start = 0, end = size - 1, middle = (start + end) / 2;

    while(start <= end)
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

    if(vet[middle] == x) return middle;

    if(vet[start] - x > x - vet[end]) return end;
    return start;
}

void insertion_sort(double vet[], int size)
{
    int i, j;
    double aux;

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

void fill_vet(double vet[], int qtd)
{
    for(int i = 0; i < qtd; i++)
    {
        system("cls");
        printf("Inserindo no vetor\n");
        printf("Registro %d: ", i + 1);
        scanf("%lf", &vet[i]);
    }
}

void print_vet(double vet[], int qtd)
{
    for(int i = 0; i < qtd; i++)
    {
        printf("\nRegistro %d: %.2lf", i + 1, vet[i]);
    }
}
