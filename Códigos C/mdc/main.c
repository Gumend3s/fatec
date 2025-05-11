#include <stdio.h>
#include <stdlib.h>

int mdc(int m, int n)
{
    if(n < m)
    {
        int aux;
        aux = m;
        m = n;
        n = aux;
    }

    int i, mdc = 1;

    for(i = 2; i < n; i++)
    {
        if(!(m % i || n % i)) mdc = i;
    }
    return mdc;
}

int main()
{
    int m, n;

    scanf("%d%d", &m, &n);

    system("cls");
    printf("%d", mdc(m, n));

    return 0;
}
