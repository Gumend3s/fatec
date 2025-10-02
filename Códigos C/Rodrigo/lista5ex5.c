#include <stdio.h>

int teste(int a, int b, int n);

int pitagorico(int n);

int main()
{
    int a, b, n, n2;
    
    printf("Digite o numero a de (a^2 + b^2 = n): ");
    scanf("%d", &a);
    printf("Digite o numero b de (a^2 + b^2 = n): ");
    scanf("%d", &b);
    printf("Digite o numero n de (a^2 + b^2 = n): ");
    scanf("%d", &n);

    int teste1 = teste(a, b, n);
    printf("Primeira formula: \n");
    if( teste1 == 1)
        printf("É pitagorico!!\n");
        else
        printf("Não é pitagorico!!\n"); 
    
    printf("Digite o numero n de (a^2 + b^2 = n): ");
    scanf("%d", &n2);
        
    int teste2 = pitagorico(n2);
    printf("Segunda formula: \n");
    if( teste2 == 1)
        printf("É pitagorico!!");
        else
        printf("Não é pitagorico!!");
        
    return 0;
}

int teste(int a, int b, int n){
    if((a * a + b * b) == n)
        return 1;
        else
        return 0;
}

int pitagorico(int n){
    int i, j, aux;
    for(i = 0; i < n; i++){
        for(j = 0; j < n; j++){
            aux = i * i + j * j;
            if(aux == n)
            return 1;
            
        }
    }
    return 0;
}