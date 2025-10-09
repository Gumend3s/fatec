import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para converter para binário: ");
        int numero = scanner.nextInt();

        String resultadoBinario = TransfomacaoBinaria.converterParaBinario(numero);

        System.out.println("O número " + numero + " em binário é: " + resultadoBinario);
        int exemplo = 25;
        System.out.println("\n--- Exemplo com o número 25 ---");
        System.out
                .println("O número " + exemplo + " em binário é: " + TransfomacaoBinaria.converterParaBinario(exemplo));

        scanner.close();
    }
}