#include <stdio.h>
#include <math.h>

double desvioPadrao(double v[], int tam);

int main()
{
    int tam, i;

    printf("Digite o tamanho do vetor:");
    scanf("%d", &tam);

    double vet[tam];

    printf("Digite os numeros do vetor");
        for(i = 0; i < tam; i++)
            scanf("%lf", &vet[i]);


    double desvio = desvioPadrao(vet, tam);

    printf("Desvio padrao: %lf\n", desvio);
    return 0;
}

double desvioPadrao(double v[], int tam){
    int i;
    double media = 0, soma = 0;

        for(i = 0; i <tam; i++)
            media += v[i];
        media /= tam;

        for(i = 0; i < tam ; i++)
            soma += (v[i] - media) * (v[i] - media);


        return sqrt(soma / tam);
}
