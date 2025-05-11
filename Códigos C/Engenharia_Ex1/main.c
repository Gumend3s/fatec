#include <stdio.h>
#include <stdlib.h>

/*
    Brendow Gabriel Canhin do Carmo - 2760482421011
    Gustavo Mendes Oliveira         - 2760482421030
    Luiza Ramos da Silva Borges     - 2760482421015
*/
/*
    Passos para testar o programa:
    - Tentar colocar um caractere ou número inválido na quantidade de números para
      serem digitados(ex: -5, 0, a, b, *, /)
    - Passando do primeiro teste, o mesmo deve ser feito na inserção de números
    - Verificar também se a quantidade de números ja digitados está sendo atualizada
      corretamente e se ela se alinha com o finalização da seção de digitação
    - Por fim verificar se o número exibido como resultado realmente foi o maior digitado
*/

int main()
{
	int i, valor, maior, qtd = 0, verificacao = 0;

	do{
    	system("cls");
        if(verificacao) printf("Valor invalido, tente novamente\n");
    	printf("Digite quantos numeros serao digitados: ");
    	scanf("%d", &qtd);

    	verificacao = 0;
    	while (getchar() != '\n') verificacao = 1;
	} while(verificacao || qtd <= 0);

	for(i = 0; i < qtd; i++)
	{
    	do{
        	system("cls");
        	printf("Numeros digitados: %d de %d\n", i, qtd);
            if(verificacao) printf("Valor invalido, tente novamente\n");
        	printf("Digite um numero: ");
        	scanf("%d", &valor);

        	verificacao = 0;
        	while (getchar() != '\n') verificacao = 1;
    	} while(verificacao);
    	if (i == 0 || valor > maior) maior = valor;
	}

	system("cls");
	printf("O maior numero digitado foi: %d", maior);

	return 0;
}
