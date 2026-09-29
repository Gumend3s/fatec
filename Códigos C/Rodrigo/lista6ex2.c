#include <stdio.h>
#include <string.h>

typedef struct Data{
int dia;
int mes;
int ano;
}Data;

void ordena(Data vet[], int tam){
    int i, j, menor;
    Data aux;

    for(i = 0; i < tam - 1; i++){
        menor = i;
        for(j = i + 1; j < tam; j++){
            if(vet[j].ano < vet[menor].ano)
                menor = j;

            else if(vet[j].ano == vet[menor].ano){
                if(vet[j].mes < vet[menor].mes)
                    menor = j;

                else if(vet[j].mes == vet[menor].mes){
                    if(vet[j].dia < vet[menor].dia)
                        menor = j;
                }
            }
        }

        if(menor != i){
            aux = vet[i];
            vet[i] = vet[menor];
            vet[menor] = aux;
        }
    }
}

int main(){
    Data vet[] = {
        {26, 3, 2006},
        {5, 11, 2004},
        {4, 12, 2005},
        {8, 8, 2005}
        };

    int tam = 4;

    ordena(vet,tam);

    printf("Datas em  Ordem: \n");

    for(int i=0; i<tam; i++){
        printf("Dia: %d | Mes: %d | Ano: %d\n", vet[i].dia, vet[i].mes, vet[i].ano);
    }
    return 0;
}
