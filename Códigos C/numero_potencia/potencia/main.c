#include <stdio.h>
#include <stdlib.h>

double pot(double a, int b)
{   int i;
    double res = 1;

    for(i = 1; i <= b; i++)
    {
        res *= a;
        return printf("%lf^%d = %lf",a, i, res);
    }
}

double readNum()
{   double a;
    printf("escreva ai: ");
    scanf("%lf", a);

    return a;
}

int main()
{
    double a;
    int b;

    a = readNum();
    b = readNum();
    pot(a,b);

    return 0;
}
