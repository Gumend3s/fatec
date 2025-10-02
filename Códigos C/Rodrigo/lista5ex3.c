#include <stdio.h>

int mdc(int m, int n);

int main()
{
    int m, n, resultado;
    
    printf("Digite o maior numero: ");
    scanf("%d", &m);
    printf("Digite o menor numero: ");
    scanf("%d", &n);

    resultado = mdc(m, n);
    printf("MDC: %d", resultado);

    return 0;
}

int mdc(int m, int n){
    int aux = 1;
    if(n == 0)
        return m;
    if(n > 0){
        while(aux != 0){
            aux = m % n;
            m = n;
            n = aux;
        }
    }
    
    return m;
}