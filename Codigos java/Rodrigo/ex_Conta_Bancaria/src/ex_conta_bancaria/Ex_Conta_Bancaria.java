package ex_conta_bancaria;

import javax.swing.JOptionPane;

public class Ex_Conta_Bancaria {
    public static void main(String[] args) {
        Conta_do_Banco c1 = new Conta_do_Banco();

        System.out.println("Saldo: " + 
                c1.getSaldo());
        
        c1.depositar(2000);
        
        System.out.println("saldo: " + 
                c1.getSaldo());
        
    try {
            c1.sacar(5000);
        } catch (SaldoInsuficienteException e) {
            JOptionPane.showMessageDialog(null, 
                    "Desculpe, mas você é pobre" + 
                            e.getDiferenca() + 
                            "reais!\n" +
                            e.getMessage(),
                            "Problema",
                            JOptionPane.ERROR_MESSAGE);
        }

        System.out.println("Saldo final: " + c1.getSaldo());
}
}
