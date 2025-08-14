#include <stdio.h>

float calcular_media(int provas[], int quantprovas){
    int i;
    float media;
    for(i = 0; i < quantprovas; i++){
        media += provas[i];
    }
    return media / quantprovas;
}

int main()
{
    int quantprovas, i;
    float media;
    
    printf("digite a quantidade de provas:");
    scanf("%d", &quantprovas);
    
    int provas[quantprovas];
    
    printf("digite as notas: ");
    for(i = 0; i < quantprovas; i++)
    scanf("%d", &provas[i]);
    
    media = calcular_media(provas, quantprovas);
    printf(" Media do aluno: %.2f\n", media);
    
    return 0;
}