import java.util.Random;

public class App {

    public static void main(String[] args) {
        int li = 7;
        int co = 5;

        int[][] matA = new int[li][co];
        Random random = new Random();
        for (int i = 0; i < li; i++) {
            for (int j = 0; j < co; j++) {
                matA[i][j] = random.nextInt(100) + 1;
            }
        }

        System.out.println("Matriz Gerada e Somatória de cada Linha:");

        for (int i = 0; i < li; i++) {
            int somaLi = 0;
            for (int j = 0; j < co; j++) {
                System.out.printf("%4d ", matA[i][j]);
                somaLi += matA[i][j];
            }
            System.out.println(" | Soma = " + somaLi);
        }
    }
}