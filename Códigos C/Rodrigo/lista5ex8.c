#include <stdio.h>


void transposta(double mat1[30][30], double matRes[30][30], int n){
    int i, j;
    for(i = 0; i < n; i++){
        for(j = 0; j < n; j++)
            matRes[j][i] = mat1[i][j];
    }

}

int main(){
    int i, j, n;

    printf("Escreva o tamanho do vetor x da sua matriz(ate 30): ");
        scanf("%d", &n);

    double mat1[30][30], matRes[30][30];

    for(i = 0; i < n; i++){
        for(j = 0; j < n; j++)
            scanf("%lf", &mat1[i][j]);
    }
    transposta(mat1, matRes,n);

    printf("\nMatriz Transposta\n");
        for(i = 0; i<n; i++){
            for(j=0; j<n; j++)
                printf("%.0lf |", matRes[i][j]);
            printf("\n");
        }
    return 0;
}
