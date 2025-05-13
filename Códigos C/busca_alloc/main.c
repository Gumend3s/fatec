#include <stdio.h>
#include <stdlib.h>


int *iniVet(int *size, int *maxSize);
void printVet(int *v, int size);
int *addVet(int *v, int *size, int *maxSize, int e);

int main() {
    int size;
    int maxSize;
    int *vet;
    int n;
    int resposta;

    vet = iniVet(&size, &maxSize);

    printf("Quantos elementos você vai adicionar? ");
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        printf("Digite o elemento da posição %d: ", i);
        scanf("%d", &resposta);
        vet = addVet(vet, &size, &maxSize, resposta);
}


printf("[");
printVet(vet, size);
printf("]\n");

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
    v[*size] = e;
    (*size)++;
    return v;
}
