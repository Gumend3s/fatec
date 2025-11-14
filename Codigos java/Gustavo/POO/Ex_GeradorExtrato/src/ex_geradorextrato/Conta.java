/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_geradorextrato;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author gustavo.oliveira262
 */
public class Conta {
    private String nome;
    private double saldo;
    private List<Double> transacoes = new LinkedList<Double>();
    
    public Conta(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
        this.transacoes.add(saldoInicial);
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getTransacoes() {
        return transacoes;
    }
    
    
    public double verSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
        this.transacoes.add(valor);
    }
    
    public void sacar(double valor) {
        this.saldo -= valor;
        this.transacoes.add(-valor);
    }
    
    @Override
    public String toString() {
        return "O dono da conta é " + this.nome + "\nO valor guardado é de: " + this.verSaldo();
    }
}
