/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_contabancaria;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.oliveira262
 */
public class ContaBanco {
    private float saldo;
    private String dono;

    public ContaBanco(String dono) {
        this.saldo = 0;
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public String getDono() {
        return dono;
    }
    
    public void depositar(float valor){
        this.saldo += valor;
    } 

    public void sacar(float valor){
        if (valor > this.saldo) {
            JOptionPane.showMessageDialog(null, 
                     "Valor inválido\n" +
                     "O valor passado é maior que o saldo disponível", "Erro", 
                     JOptionPane.ERROR_MESSAGE);
        } else {
            this.saldo -= valor;
        }
    }
    
    public void mostrarSaldo() {
        System.out.println(this.dono + ": " + String.format("%.2f", this.saldo) + "R$");
    }
}
