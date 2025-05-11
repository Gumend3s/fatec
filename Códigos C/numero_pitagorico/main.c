#include <stdio.h>
#include <stdlib.h>

int teste(int a, int b, int n)
{
    return a*a + b*b == n;
}

int pitagorico(int n)
{
    int i, l;

    for(i = 0; i*i <= n; i++)
    {
        for(l = 0; l*l + i*i <= n; l++)
        {
            if(teste(i, l, n)) return 1;
        }
    }
    return 0;
}

int main()
{
    int n;

    scanf("%d",&n);

    system("cls");
    printf("%d", pitagorico(n));

    return 0;
}
