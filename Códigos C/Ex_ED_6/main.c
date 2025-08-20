#include <stdio.h>
#include <stdlib.h>

typedef struct pesoAltura {
    float peso;
    int altura; // em centimetros
} pesoAltura;

int main() {
    pesoAltura *pessoas;

    // Aloca��o de mem�ria corrigida
    pessoas = (pesoAltura*) malloc(2 * sizeof(pesoAltura));

    // Verifica��o de erro na aloca��o
    if (pessoas == NULL) {
        printf("Erro na alocacao de memoria!\n");
        return 1;
    }

    for (int i = 0; i < 2; i++) {
        printf("Digite o peso da pessoa %d: ", i + 1);
        // Passando o endere�o correto para scanf
        scanf("%f", &pessoas[i].peso);

        printf("Digite a altura da pessoa %d: ", i + 1);
        // Passando o endere�o correto para scanf
        scanf("%d", &pessoas[i].altura);
    }

    for (int i = 0; i < 2; i++) {
        // Acesso aos membros da estrutura est� correto neste loop
        printf("A pessoa %d tem peso = %.2f e altura = %d\n", i + 1, pessoas[i].peso, pessoas[i].altura);
    }

    // Libere a mem�ria alocada dinamicamente
    free(pessoas);

    return 0;
}
