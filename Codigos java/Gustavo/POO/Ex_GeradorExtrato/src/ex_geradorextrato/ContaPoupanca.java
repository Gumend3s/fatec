/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_geradorextrato;

/**
 *
 * @author gustavo.oliveira262
 */
public class ContaPoupanca extends Conta {
    private double taxRendimento;
    
    public ContaPoupanca(String nome, double saldoInicial) {
        super(nome, saldoInicial);
        this.taxRendimento = 0.5;
    }
    
    public double getTaxRendimento() {
        return this.taxRendimento;
    }
    
    public void setTaxREndimento(double valor) {
        this.taxRendimento = valor;
    }
}
