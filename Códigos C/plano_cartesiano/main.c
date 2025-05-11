#include <stdio.h>
#include <stdlib.h>

struct Coordenada{
    float x;
    float y;
};
typedef struct Coordenada Coordenada;

Coordenada leCoordenada();
void escreveCoordenada(Coordenada co);
Coordenada somaCoordenada(Coordenada c1, Coordenada c2);
Coordenada subCoordenada(Coordenada c1, Coordenada c2);
Coordenada multCoordenada(Coordenada c1, float x);

int main()
{
    Coordenada c1, c2;
    float x;

    printf("Lendo Coordenada 1\n");
    c1 = leCoordenada();

    system("cls");

    printf("Lendo Coordenada 2\n");
    c2 = leCoordenada();

    system("cls");

    printf("Digite um numero escalar: ");
    scanf("%f", &x);

    system("cls");

    printf("1: ");
    escreveCoordenada(c1);
    printf("\n2: ");
    escreveCoordenada(c2);

    Coordenada res;

    printf("\nSoma das coordenadas: ");
    res = somaCoordenada(c1, c2);
    escreveCoordenada(res);

    printf("\nSubtracao das coordenadas: ");
    res = subCoordenada(c1, c2);
    escreveCoordenada(res);

    printf("\nMultiplicacao pelo escalar");
    printf("\nCoordenada1: ");
    res = multCoordenada(c1, x);
    escreveCoordenada(res);
    printf("\nCoordenada2: ");
    res = multCoordenada(c2, x);
    escreveCoordenada(res);

    return 0;
}

Coordenada leCoordenada()
{
    Coordenada aux;

    printf("Digite o valor de X: ");
    scanf("%f", &aux.x);

    printf("Digite o valor de Y: ");
    scanf("%f", &aux.y);

    return aux;
};

void escreveCoordenada(Coordenada co)
{
    printf("(%.2f, %.2f)", co.x, co.y);
}

Coordenada somaCoordenada(Coordenada c1, Coordenada c2)
{
    Coordenada res;
    res.x = c1.x + c2.x;
    res.y = c1.y + c2.y;
    return res;
}

Coordenada subCoordenada(Coordenada c1, Coordenada c2)
{
    Coordenada res;
    res.x = c1.x - c2.x;
    res.y = c1.y - c2.y;
    return res;
}

Coordenada multCoordenada(Coordenada c1, float x)
{
    Coordenada res;
    res.x = c1.x * x;
    res.y = c1.y * x;
    return res;
}
