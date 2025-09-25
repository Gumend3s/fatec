import java.util.Random;

public class MaiorElementoMatriz {

    public static void main(String[] args) {
        int li = 4;
        int co = 3;
        int[][] matB = new int[li][co];
        Random random = new Random();
        for (int i = 0; i < li; i++) {
            for (int j = 0; j < co; j++) {
                matB[i][j] = random.nextInt(100) + 1;
            }
        }
        int maiorE = matB[0][0];
        int liMaior = 0;
        int coMaior = 0;
        for (int i = 0; i < li; i++) {
            for (int j = 0; j < co; j++) {
                if (matB[i][j] > maiorE) {
                    maiorE = matB[i][j];
                    liMaior = i;
                    coMaior = j;
                }
            }
        }
        System.out.println("Matriz Gerada B(4x3):");
        for (int i = 0; i < li; i++) {
            for (int j = 0; j < co; j++) {
                System.out.printf("%4d ", matB[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n--- Informações do Maior Elemento ---");
        System.out.println("Maior Elemento: " + maiorE);
        System.out.println("Posição: Linha " + (liMaior + 1) + ", Coluna " + (coMaior + 1));
    }
}