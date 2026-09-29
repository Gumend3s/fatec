#include <stdio.h>
#include <string.h>

typedef struct Produto{
char nome[80];
double preco;
int quantidade;
}Produto;

produto{nome, preço, quantidade};
chocolate.produto{chocolate, 15, 10}

void ordenaPreco(Produto vet[], int n){
    int i, j, menor;
    Produto aux;

    for(i = 0; i < n - 1; i++){
        menor = i;
        for(j = i + 1; j < n; j++){
            if(vet[j].preco < vet[menor].preco)
                menor = j;
        }
        aux = vet[i];
        vet[i] = vet[menor];
        vet[menor] = aux;
    }
}

void ordenaQuant(Produto vet[], int n){
    int i, j, menor;
    Produto aux;

    for(i = 0; i < n - 1; i++){
        menor = i;
        for(j = i + 1; j < n; j++){
            if(vet[j].quantidade < vet[menor].quantidade)
                menor = j;
        }
        aux = vet[i];
        vet[i] = vet[menor];
        vet[menor] = aux;
    }
}

int main(){

    Produto vet[] = {
        {"Chocolate", 5.00, 130},
        {"Bombom", 1.50, 280},
        {"Bolo", 20.80, 50},
        {"Sorvete", 14.70, 100}
    };

    int n = 4;

    ordenaPreco(vet, n);

    printf("Ordenado por preco:\n");

    for(int i = 0; i < n; i++)
        printf("%s - R$ %.2lf - %d\n",
               vet[i].nome,
               vet[i].preco,
               vet[i].quantidade);

    ordenaQuant(vet, n);

    printf("\nOrdenado por quantidade:\n");

    for(int i = 0; i < n; i++)
        printf("%s - R$ %.2lf - %d\n",
               vet[i].nome,
               vet[i].preco,
               vet[i].quantidade);

    return 0;
}
