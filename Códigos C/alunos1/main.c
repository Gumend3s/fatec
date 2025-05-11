#include <stdio.h>
#include <stdlib.h>

#define QTD 5

struct Aluno{
    int RA;
    int idade;
};

typedef struct Aluno Aluno;

Aluno leAluno();

int main()
{
    int i;
    Aluno alunos[QTD];

    for(i = 0; i < QTD; i++)
    {
        system("cls");
        printf("Inserindo aluno %d", i+1);
        printf("\n");
        alunos[i] = leAluno();
    }

    float total = 0;
    for(i = 0; i < QTD; i++)
    {
        total += alunos[i].idade;
    }

    float res;
    res = total / QTD;

    system("cls");
    printf("A média da idade dos alunos e: %.1f", res);

    return 0;
}

Aluno leAluno()
{
    Aluno aux;
    printf("Digite o RA do aluno: ");
    scanf("%d", &aux.RA);
    printf("Digite a idade do aluno: ");
    scanf("%d", &aux.idade);

    return aux;
}
