#include <stdio.h>

int multiplica(int a, int b) {


    return a + multiplica(a, b - 1);
}

int main() {
    int a, b;

    printf("Digite a e b: ");
    scanf("%d %d", &a, &b);

    printf("%d\n", multiplica(a, b));

    return 0;
}
