#include <stdio.h>

int amigos(int a, int b);

int main()
{   
    int a, b, resultado;
    
    printf("Digite 1 numero: ");
    scanf("%d", &a);
    printf("Digite 2 numero: ");
    scanf("%d", &b);
    
    resultado = amigos(a, b);
    
    if(resultado == 1){
        printf("Os numeros sao amigos!");
    } else {
        printf("Os numeros nao sao amigos!");
    }
    
    return 0;
}

int amigos(int a, int b){
     int somaA = 0, somaB = 0, i;
     
     for(i = 1; i < a; i++){
         if(a % i == 0)
             somaA += i;
     }
     for(i = 1; i < b; i++){
         if(b % i == 0)
             somaB += i;
     }
     if(somaA == b && somaB == a){
         return 1;
     } else{
         return 0;
     }
 }