#include <stdio.h>

int menor_base_log(int n);

int main()
{   
    int n;
    
    printf("Digite um numero: ");
    scanf("%d", &n);

    int resultado = menor_base_log(n);
    printf("Menor base: %d\n", resultado);

    return 0;
}

int menor_base_log(int n){
    int b, k = 0;
    if(n == 1)
        return n;
    for(b = 2; b <= n; b++){
        int aux = n;
        while(aux % b == 0){
            aux = aux / b;
            k++;
        }
        
        
        if(aux == 1 && k > 1)
        return b;
    }
    return n;
}