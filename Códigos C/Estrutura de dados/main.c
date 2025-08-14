#include <stdio.h>

int absoluto(int num){
    int i;
    if(num < 0){
    return -num;
    }else{
        return num;
    }
}

int main()
{
    int quantnum, resultado = 0, modulo = 0, i;
    
    printf("digite a quantidade de números:");
    scanf("%d", &quantnum);
    
    int num[quantnum];
    
    if(quantnum == 1 || quantnum == 0){
        printf("Resultado = 0, Modulo = 0");
        return 0;
    }
    
    printf("digite os números: ");
    for(i = 0; i < quantnum; i++)
    scanf("%d", &num[i]);

    for(i = 0; i < quantnum - 1; i++){
    resultado = num[i] * num[i+1];
    printf("Resultado de %dx%d = %d \n", num[i], num[i+1], resultado);
    modulo = absoluto(resultado);
    printf("Módulo de %d = %d \n", num[i], modulo);
    }
    
    return 0;
}