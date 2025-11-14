/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_geradorextrato;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author gustavo.oliveira262
 */
public class GeradorExtrato {
    public void gerarExtrato(Conta c) {
        System.out.println("==============================");
        SimpleDateFormat formatoData = 
                new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();
        System.out.println(formatoData.format(agora).toString());
        System.out.println("Extrato de " + c.getNome() + ":");
        for(double f: c.getTransacoes()) {
            if(f > 0) {
                System.out.println("Depositou: " + f);
            } else {
                System.out.println("Sacou: " + (-f ));
            }
        }
        if(c instanceof ContaCorrente) {
            System.out.println(((ContaCorrente) c).verLimite());
        }
        if(c instanceof ContaPoupanca) {
            System.out.println(((ContaPoupanca) c).getTaxRendimento());
        }
        System.out.println("==============================\n");
    }
}
