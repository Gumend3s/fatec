#include <stdio.h>
#include <string.h>

typedef struct Pessoa{
int rg;
int cpf;
char nome[80];
}Pessoa;

typedef struct Base{
int armazenado; //Deve sempre corresponder ao número de pessoas na base
Pessoa pessoas[100];
}Base;

Base cria_base(){
    Base b;
    b.armazenado = 0;
    return b;
}

int insere_base(Pessoa p, Base *base);
int remove_base(int rg, Base *base);

int main(){
    *int vet, size, maxSize;
    int i;
    Base cria_base();

    vet = (int *) malloc(80 * sizeof(int));


}
