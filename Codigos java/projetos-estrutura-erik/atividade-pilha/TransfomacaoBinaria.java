

public class TransfomacaoBinaria {

    public static String converterParaBinario(int numeroDecimal) {
        if (numeroDecimal == 0) {
            return "0";
        }
        if (numeroDecimal < 0) {
            return "Número negativo não suportado por este método.";
        }

        pilha<Integer> Pilha = new pilha<>();
        int numero = numeroDecimal;

        while (numero > 0) {
            int resto = numero % 2; 
            Pilha.push(resto); 
            numero = numero / 2; 
        }
        StringBuilder binario = new StringBuilder();
        while (!Pilha.isEmpty()) {
            binario.append(Pilha.pop());
        }

        return binario.toString();
    }

}
