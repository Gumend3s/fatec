/*Fa¸ca uma fun¸c˜ao que recebe como parˆametro dois vetores de inteiros
representando conjuntos de n´umeros inteiros, e devolve um outro
vetor com o resultado da uni˜ao dos dois conjuntos. O vetor resultante
deve ser alocado dinamicamente.
O prot´otipo da fun¸c˜ao ´e
i n t ∗ u n i a o ( i n t v1 [ ] , i n t n1 , i n t v2 [ ] , i n t n2 ) ;
onde n1 e n2 indicam o n´umero de elementos em v1 e v2
respectivamente.*/

#include<stdio.h>
#include<stdlib.h>

int *uniao(int v1[], int n1, int v2[], int n2, int *tam);
int contem(int vetor[], int tamanho, int elemento);

int main(){
    int v1[] = {2, 3, 4, 5};
    int v2[] = {4, 5, 6, 7, 8};
    int n1 = sizeof(v1)/sizeof(v1[0]);
    int n2 = sizeof(v2)/sizeof(v2[0]);
    int tamanho = 0;
    int *resultado = uniao(v1, n1, v2, n2, &tamanho);

    printf("União dos conjuntos: {");
    for (int i = 0; i < tamanho; i++) {
        printf("%d", resultado[i]);
        if (i < tamanho - 1) {
            printf(", ");
        }
    }
    printf("}\n");

    free(resultado);
    return 0;
}


int *uniao(int v1[], int n1, int v2[], int n2, int *tam){
    int *vetorUniao;
    int i;
    vetorUniao = malloc((n1 + n2) * sizeof(int));

    for(i = 0; i <n1; i++){
        vetorUniao[(*tam)++] = v1[i];
    }
    for (int i = 0; i < n2; i++) {
        if (!contem(vetorUniao, *tam, v2[i])) {
            vetorUniao[(*tam)++] = v2[i];
        }
    }

    // Realoca o vetorUniao para o tamanho correto (sem espaços não utilizados)
    vetorUniao = realloc(vetorUniao, (*tam) * sizeof(int));


    return vetorUniao;
}

int contem(int vetor[], int tamanho, int elemento) {
    for (int i = 0; i < tamanho; i++) {
        if (vetor[i] == elemento) {
            return 1; // Elemento encontrado
        }
    }
    return 0; // Elemento não encontrado
}
