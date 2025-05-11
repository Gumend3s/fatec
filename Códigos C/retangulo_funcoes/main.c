#include <stdio.h>
#include <stdlib.h>


int conta(int largura, int altura)
{
    int area;

    area = largura * altura;
    return area;
}

int leitura()
{
    int valor;
    printf("Digite um valor:");
    scanf("%d", &valor);
    return valor;
}

int main()
{
    int altura, largura, area;

    altura = leitura();
    largura = leitura();

    area = conta(largura, altura);

    printf("Resultado: %d", area);

    return 0;
}
