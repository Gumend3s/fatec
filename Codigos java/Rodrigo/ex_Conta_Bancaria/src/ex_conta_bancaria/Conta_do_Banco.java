package ex_conta_bancaria;

public class Conta_do_Banco {
    private int saldo;
    
    public int getSaldo(){
        return saldo;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor) throws SaldoInsuficienteException{
        if(this.saldo >= valor ){
            this.saldo -= valor;
        } else{
            //throw new Exception("Saldo insuficiente!");
        throw new SaldoInsuficienteException(
                this.saldo,
                valor, 
                "Saldo insuficiente!");
        }
    }
}
