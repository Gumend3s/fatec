/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supermercado;

import java.util.ArrayDeque;

/**
 *
 * @author gustavo.oliveira262
 */
public class Supermercado {

    public static void main(String[] args) {
        ArrayDeque<Cliente> filaMercado = new ArrayDeque<>();
        Cliente clienteAtual;
        int totalMinutos = 0;
        float totalDinheiro = 0;
        
        filaMercado.add(new Cliente("Ana", 10, 10));
        filaMercado.add(new Cliente("Joao", 10, 15));
        filaMercado.add(new Cliente("Maria", 10, 20));
        filaMercado.add(new Cliente("Jose", 10, 30));
        filaMercado.add(new Cliente("Antonio", 11, 00));
        filaMercado.add(new Cliente("Marcos", 11, 35));
        filaMercado.add(new Cliente("Solange", 12, 05));
        
        clienteAtual = filaMercado.remove();
        clienteAtual.setHoraatendimento(10);
        clienteAtual.setMinutoatendimento(10);
        clienteAtual.setValorgasto(150.98);
        System.out.println( "10");
        totalDinheiro += clienteAtual.getValorgasto();
        
        clienteAtual = filaMercado.remove();
        clienteAtual.setHoraatendimento(10);
        clienteAtual.setMinutoatendimento(20);
        clienteAtual.setValorgasto(25.12);
        totalMinutos += 5;
        totalDinheiro += clienteAtual.getValorgasto();
        
        clienteAtual = filaMercado.remove();
        clienteAtual.setHoraatendimento(10);
        clienteAtual.setMinutoatendimento(25);
        clienteAtual.setValorgasto(627.78);
        totalMinutos += 30;
        totalDinheiro += clienteAtual.getValorgasto();
        
        clienteAtual = filaMercado.remove();
        clienteAtual.setHoraatendimento(10);
        clienteAtual.setMinutoatendimento(55);
        clienteAtual.setValorgasto(265.29);
        totalMinutos += 10;
        totalDinheiro += clienteAtual.getValorgasto();
        
        clienteAtual = filaMercado.remove();
        clienteAtual.setHoraatendimento(11);
        clienteAtual.setMinutoatendimento(05);
        clienteAtual.setValorgasto(200.67);
        totalMinutos += 15;
        totalDinheiro += clienteAtual.getValorgasto();
        
        clienteAtual = filaMercado.remove();
        clienteAtual.setHoraatendimento(11);
        clienteAtual.setMinutoatendimento(35);
        clienteAtual.setValorgasto(15.83);
        totalMinutos += 15;
        totalDinheiro += clienteAtual.getValorgasto();
        
        clienteAtual = filaMercado.remove();
        clienteAtual.setHoraatendimento(12);
        clienteAtual.setMinutoatendimento(05);
        clienteAtual.setValorgasto(1200.00);
        totalMinutos += 45;
        totalDinheiro += clienteAtual.getValorgasto();
        
    }
}
