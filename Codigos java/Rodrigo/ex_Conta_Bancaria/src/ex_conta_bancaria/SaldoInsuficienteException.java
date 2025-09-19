package ex_conta_bancaria;

public class SaldoInsuficienteException extends Exception {
    private double diferenca;

    public SaldoInsuficienteException(double saldoConta, double valorSaque, String mensagem) {
        super(mensagem);
        this.diferenca = valorSaque - saldoConta;
    }

    public double getDiferenca() {
        return this.diferenca;
    }
}
