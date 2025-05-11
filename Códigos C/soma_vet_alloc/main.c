#include <stdio.h>
#include <stdlib.h>

double * criaVet(int tam);
void preencheVet(double vet[], int tam);
void somaVet(double v1[], double v2[], double res[], int tam);

int main()
{
    double *v1, *v2, *res;
    int n, i;

    printf("Digite o tamanho dos vetores: ");
    scanf("%d", &n);

    v1 = criaVet(n);
    v2 = criaVet(n);
    res = criaVet(n);

    system("cls");
    printf("Inserindo no vetor 1\n");
    preencheVet(v1, n);
    system("cls");
    printf("Inserindo no vetor 2\n");
    preencheVet(v2, n);

    somaVet(v1, v2, res, n);

    system("cls");
    printf("Resultado: \n");
    for(i = 0; i < n; i++)
    {
        printf("[%2.lf ] ", res[i]);
    }

    return 0;
}

double * criaVet(int tam)
{
    return malloc(tam*sizeof(double));
}

void preencheVet(double vet[], int tam)
{
    int i;
    for(i= 0; i < tam; i++)
    {
        printf("Posicao %d: ", i+1);
        scanf("%lf", &vet[i]);
    }
}

void somaVet(double v1[], double v2[], double res[], int tam)
{
    int i;
    for(i = 0; i < tam; i++)
    {
        res[i] = v1[i] + v2[i];
    }
}
