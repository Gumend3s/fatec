#include <stdio.h>

double media(double v[], int tam);

int main()
{   
    int tamanho, i;
    
    printf("Digite o numero de elementos: ");
    scanf("%d", &tamanho);
    
    double vet[tamanho];
    
    printf("Digite os numeros do vetor: ");
    for(i = 0; i < tamanho; i++){
        scanf("%lf", &vet[i]);
    }
    
    double aritmetica = media(vet, tamanho);
    
    printf("Media: %lf", aritmetica);
    
    return 0;
}

double media(double v[], int tam){
    int i, media = 0;
    for(i = 0; i < tam; i++){
        media += v[i];
    }
    return media / tam;
}