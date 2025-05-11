#include <stdio.h>
#include <stdlib.h>

int pot(x, y)
{
    if(x == 1 || y == 0) return 1;
    if(x == 0) return 0;

    int i, pot = 1;
    for(i = 0; i < y; i++)
    {
        pot *= x;
    }
    return pot;
}

int menor_base_log(int n)
{
    int i, l;

    for(i = 2; i*i < n; i++)
    {
        for(l = 0; pot(i, l) <= n; l++)
        {
            if(pot(i, l) == n) return i;
        }
    }

    return n;
}

int main()
{
    int n;

    scanf("%d", &n);

    system("cls");
    printf("%d", menor_base_log(n));

    return 0;
}
