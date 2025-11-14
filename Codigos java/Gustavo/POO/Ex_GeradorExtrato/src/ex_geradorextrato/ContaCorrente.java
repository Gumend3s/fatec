/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_geradorextrato;

/**
 *
 * @author gustavo.oliveira262
 */
public class ContaCorrente extends Conta {
    private double limite;
    
    public ContaCorrente(String nome, double saldoInicial, double limite) {
        super(nome, saldoInicial);
        this.limite = limite;
    } 
    
    public double verLimite() {
        return this.limite;
    }
    
    public void adicionarLimite(double valor) {
        this.limite += valor;
    }
}
