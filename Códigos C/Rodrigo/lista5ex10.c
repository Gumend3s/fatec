#include <stdio.h>

void multiplica(double mat1[30][30], double mat2[30][30], double matRes[30][30], int n){
    int i, j;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                matRes[i][j] = mat1[i][j] * mat2[i][j];
            }
        }
}

int main(){
    int i, j, n;
    double mat1[30][30], mat2[30][30], matRes[30][30];

    printf("Escreva o tamanho das suas matrizes(ate 30): ");
        scanf("%d", &n);
    printf("\nConteudo da primeira:");
    for(i=0; i<n; i++){
        for(j=0; j<n; j++)
            scanf("%lf", &mat1[i][j]);
    }

    printf("\nConteudo da sua segunda matriz: ");
    for(i=0; i<n; i++){
        for(j=0; j<n; j++)
            scanf("%lf", &mat2[i][j]);
    }

    multiplica(mat1, mat2, matRes, n);

    printf("\nMatriz multiplicada\n");
        for(i=0; i<n; i++){
            for(j=0; j<n; j++)
                printf("%0.lf | ", matRes[i][j]);
            printf("\n");
        }
}
