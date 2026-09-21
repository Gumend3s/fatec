#include <stdio.h>

void verifica(int mat[30][30], int n, int resposta[]){
    int i, j, aux = 0;
    for(i=0; i<n; i++){
        for(j=0; j<n; j++){
            aux += mat[i][j];
        }
        if(aux >= 1){
            resposta[i] = 1;
        }else{
            resposta[i] = 0;
        }
        aux = 0;
    }
}


int main(){
    int i, j, n;
    int mat[30][30];

    printf("Escreva o tamanho da matriz(ate 30): ");
        scanf("%d", &n);

    int resposta[n];

    printf("\nConteudo da matriz(0 ou 1): ");
    for(i=0; i<n; i++){
        for(j=0; j<n; j++)
            scanf("%d", &mat[i][j]);
    }
    verifica(mat, n, resposta);

    printf("\nCaminhos(1 = Sim | 0 = Nao) \n");
    for(i=0; i<n; i++)
        printf("%d | \n", resposta[i]);

    return 0;
}
