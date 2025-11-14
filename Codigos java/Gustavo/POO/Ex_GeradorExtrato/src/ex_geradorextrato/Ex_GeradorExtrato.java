/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_geradorextrato;

/**
 *
 * @author gustavo.oliveira262
 */
public class Ex_GeradorExtrato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("Gustavo", 1000, 10000);
        
        cc.depositar(100);
        cc.depositar(300);
        cc.sacar(20);
        cc.depositar(50);
        cc.sacar(1225);
        
        GeradorExtrato ge = new GeradorExtrato();
        
        ge.gerarExtrato(cc);
    }
    
}
