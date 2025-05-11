#include <stdio.h>
#include <stdlib.h>

int amigos(int a, int b)
{
    if(somaRest(a) == b && somaRest(b) == a)
        return 1;
    return 0;
}

int somaRest(int a)
{
    int i, p=0;

    for(i=1; i<a; i++)
        if(a%i == 0) p = p + i;

    return p;
}

int main()
{
    int a, b;

    scanf("%d%d",&a, &b);

    if(amigos(a,b))
        printf("amuigos");
    else printf("nao amuigos");
    return 0;
}
