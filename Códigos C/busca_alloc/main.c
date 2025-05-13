#include <stdio.h>
#include <stdlib.h>


int *iniVet(int *size, int *maxSize);
void printVet(int *v, int size);
int *addVet(int *v, int *size, int *maxSize, int e);
int find(int *v, int size, int e);
int *removeVet(int *v, int *size, int *maxSize, int e);

int main() {
    int size, maxSize, *vet, n, resposta;
    int i, busca;
    vet = iniVet(&size, &maxSize);

    printf("Quantos elementos você vai adicionar? ");
    scanf("%d", &n);
    for(i = 0; i < n; i++){
        printf("Digite o elemento da posição %d: ", i);
        scanf("%d", &resposta);
        vet = addVet(vet, &size, &maxSize, resposta);
}


printf("[");
printVet(vet, size);
printf("]\n");

    printf("Escolha um elemento para ser retirado do vetor: ");
    scanf("%d", &resposta);
    vet = removeVet(vet, &size, &maxSize, resposta);


printf("[");
printVet(vet, size);
printf("]\n");
printf("%d", maxSize);

free(vet);
return 0;
}

int *iniVet(int *size, int *maxSize) {
    int *vetor;
    *size = 0;
    *maxSize = 4;
    vetor = malloc((*maxSize) * sizeof(int));
    if (vetor == NULL) {
        printf("Erro ao alocar memória\n");
        return 0;
    }
    return vetor;
}

void printVet(int *v, int size) {
    int i;
    for (i = 0; i < size; i++) {
        printf("%d", v[i]);
        if (i < size - 1) {
            printf(", ");
        }
    }
}

int *addVet(int *v, int *size, int *maxSize, int e) {
    int *temp;
    if (*size == *maxSize) {
        *maxSize *= 2;
        temp = realloc(v, (*maxSize) * sizeof(int));
        if (temp == NULL) {
            printf("Erro ao realocar memória\n");
            return v;
        }
        v = temp;

    }
    v[(*size)++] = e;
    return v;
}

int find(int *v, int size, int e){
    int i;
    for(i = 0; i < size; i++){
        v[i];
        if(v[i] == e){
            return i;
        }
    }
    return -1;
}

int *removeVet(int *v, int *size, int *maxSize, int e){
    int i, novoVetor;
    int n = find(v, *size, e);
    (*size)--;
    for(i = n; i < *size; i++){
        v[i] = v[i + 1];
    }

    if(*size < (*maxSize) / 4 && *maxSize > 4){
        *maxSize = (*maxSize)/2;
        novoVetor = realloc(v, (*maxSize) * sizeof(int));
        v = novoVetor;
    }
    return v;
}
/*
    localizar e no vetor
    retirar e do vetor
    puxar conteúdo
    diminuir size
*/
