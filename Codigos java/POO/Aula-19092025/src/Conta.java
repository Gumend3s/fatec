import javax.swing.JOptionPane;

public class Conta extends Cliente{
    private int numeroConta;
    private double saldo;
    private String titular;


    public Conta( int numeroConta, double saldo, String titular, Banco banco) {
        super(banco);
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void saque(double valor){

        if(valor<=this.saldo){
            this.saldo = this.saldo - valor;
            JOptionPane.showMessageDialog(null, "O valor "+valor+" foi retirado da Conta, o seu saldo é "+saldo);
        }else{
            JOptionPane.showMessageDialog(null,"O Valor é maior do que o Cliente tem em conta!!!");
        }
        
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        JOptionPane.showMessageDialog(null,"O valor da conta foi aumentado para "+this.saldo);
    }
    
}
