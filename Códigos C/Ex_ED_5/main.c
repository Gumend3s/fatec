/*Faça um programa em C que receba uma frase qualquer fornecida pelo usuário,
calcule e mostre quantas palavras essa frase possui. Esse programa deve conter
ponteiros para manusear a string. A frase deve possuir no máximo 50 caracteres.*/
#include <stdio.h>
#include <string.h>

int main()
{
    char frase[51];
    char *p;
    int contando_palavra = 0;
    int total_palavras = 0;

    // Entrada da frase
    printf("Digite uma frase (max 50 caracteres): ");
    fgets(frase, sizeof(frase), stdin);

    // Remove o '\n' que o fgets pode guardar no final
    frase[strcspn(frase, "\n")] = '\0';

    p = frase;  // Ponteiro aponta para o início da string

    // Percorre cada caractere da frase
    while (*p != '\0') {
        if (*p != ' ' && contando_palavra == 0) {
            // Início de uma nova palavra
            contando_palavra = 1;
            total_palavras++;
        } else if (*p == ' ') {
            // Fim da palavra
            contando_palavra = 0;
        }
        p++;  // Avança o ponteiro
    }

    // Resultado
    printf("A frase possui %d palavra(s).\n", total_palavras);

    return 0;
}
