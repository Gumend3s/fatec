#include <stdio.h>
#include <stdlib.h>

void strcat(char s1[], char s2[], char sres[]);

int main()
{   int tamStr;

    printf("da um tamanho ai porra: ");
    scanf("%d", &tamStr);

    char s1[tamStr], s2[tamStr];

    printf("manda o texto ai: ");
    fgets(s1,tamStr, stdin);



    return 0;
}

void strcat(char s1[], char s2[], char sres[])
{

}
