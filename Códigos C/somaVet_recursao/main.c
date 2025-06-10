#include <stdio.h>
#include <stdlib.h>

int somaVet(int v[], int pos);

int main()
{
    int v[] = {2, 6, 9, 12, 76, 3, 87, 9};

    int soma = somaVet(v, 0);

    printf("%d", soma);
    return 0;
}

int somaVet(int v[], int pos) {
    if(pos < sizeof(v))
        return v[pos] + somaVet(v, (pos + 1));
    else
        return 0;
}
