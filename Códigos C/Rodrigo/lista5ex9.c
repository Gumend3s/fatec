#include <stdio.h>

int magico(int mat[30][30], int n);

int main(){
    int i, j, n;

    printf("Escreva o tamanho do vetor x da sua matriz(ate 30): ");
        scanf("%d", &n);

    int mat[30][30];

    for(i = 0; i < n; i++){
        for(j = 0; j < n; j++)
            scanf("%d", &mat[i][j]);
    }

    int cubo = magico(mat, n);

    if(cubo == 1){
        printf("E magico!");
    }else{
        printf("Nao e magico");
    }
    return 0;
}

int magico(int mat[30][30], int n){
    int i, j, soma = 0, compara = 0;
    for(j = 0; j<n; j++){
        soma += mat[0][j];
    }
    for(i = 0; i<n; i++){
        compara = 0;
            for(j = 0; j<n; j++){
                compara += mat[i][j];
            }
        if(compara != soma)
        return 0;
    }
    for(j = 0; j<n; j++){
        compara = 0;
            for(i = 0; i<n; i++){
                compara += mat[i][j];
            }
        if(compara != soma)
        return 0;
    }
    compara = 0;
    for(i = 0; i<n; i++){
        compara += mat[i][i];
    }
    if(compara != soma)
        return 0;
    compara = 0;
    for(i = 0; i<n; i++){
        compara += mat[i][n - 1 - i];
    }
    if(compara != soma)
        return 0;
    return 1;
}
