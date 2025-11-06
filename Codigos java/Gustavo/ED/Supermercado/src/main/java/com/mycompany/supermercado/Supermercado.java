/*
    Gustavo Mendes Oliveira
    Rodrigo Cabello Ferraz de Toledo
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
        float totalDinheiro = 0;
        int totalMinutos = 0;
        
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
        System.out.println("O atendimento de " + clienteAtual.getNome() + 
                            " se iniciou as " + Integer.toString(clienteAtual.getHoraatendimento()) +
                            ":" + Integer.toString(clienteAtual.getMinutoatendimento()) +
                            " e durou 10 minutos, o valor gasto foi de " +
                            Double.toString(clienteAtual.getValorgasto()));
        totalMinutos += 10;
        totalDinheiro += clienteAtual.getValorgasto();
        
        clienteAtual = filaMercado.remove();
        clienteAtual.setHoraatendimento(10);
        clienteAtual.setMinutoatendimento(20);
        clienteAtual.setValorgasto(25.12);
        System.out.println("O atendimento de " + clienteAtual.getNome() + 
                            " se iniciou as " + Integer.toString(clienteAtual.getHoraatendimento()) +
                            ":" + Integer.toString(clienteAtual.getMinutoatendimento()) +
                            " e durou 5 minutos, o valor gasto foi de " +
                            Double.toString(clienteAtual.getValorgasto()));
        totalMinutos += 5;
        totalDinheiro += clienteAtual.getValorgasto();
        
        clienteAtual = filaMercado.remove();
        clienteAtual.setHoraatendimento(10);
        clienteAtual.setMinutoatendimento(25);
        clienteAtual.setValorgasto(627.78);
        System.out.println("O atendimento de " + clienteAtual.getNome() + 
                            " se iniciou as " + Integer.toString(clienteAtual.getHoraatendimento()) +
                            ":" + Integer.toString(clienteAtual.getMinutoatendimento()) +
                            " e durou 30 minutos, o valor gasto foi de " +
                            Double.toString(clienteAtual.getValorgasto()));
        totalMinutos += 30;
        totalDinheiro += clienteAtual.getValorgasto();
        
        clienteAtual = filaMercado.remove();
        clienteAtual.setHoraatendimento(10);
        clienteAtual.setMinutoatendimento(55);
        clienteAtual.setValorgasto(265.29);
        System.out.println("O atendimento de " + clienteAtual.getNome() + 
                            " se iniciou as " + Integer.toString(clienteAtual.getHoraatendimento()) +
                            ":" + Integer.toString(clienteAtual.getMinutoatendimento()) +
                            " e durou 10 minutos, o valor gasto foi de " +
                            Double.toString(clienteAtual.getValorgasto()));
        totalMinutos += 10;
        totalDinheiro += clienteAtual.getValorgasto();
        
        clienteAtual = filaMercado.remove();
        clienteAtual.setHoraatendimento(11);
        clienteAtual.setMinutoatendimento(05);
        clienteAtual.setValorgasto(200.67);
        System.out.println("O atendimento de " + clienteAtual.getNome() + 
                            " se iniciou as " + Integer.toString(clienteAtual.getHoraatendimento()) +
                            ":" + Integer.toString(clienteAtual.getMinutoatendimento()) +
                            " e durou 15 minutos, o valor gasto foi de " +
                            Double.toString(clienteAtual.getValorgasto()));
        totalMinutos += 15;
        totalDinheiro += clienteAtual.getValorgasto();
        
        clienteAtual = filaMercado.remove();
        clienteAtual.setHoraatendimento(11);
        clienteAtual.setMinutoatendimento(35);
        clienteAtual.setValorgasto(15.83);
        System.out.println("O atendimento de " + clienteAtual.getNome() + 
                            " se iniciou as " + Integer.toString(clienteAtual.getHoraatendimento()) +
                            ":" + Integer.toString(clienteAtual.getMinutoatendimento()) +
                            " e durou 5 minutos, o valor gasto foi de " +
                            Double.toString(clienteAtual.getValorgasto()));
        totalMinutos += 5;
        totalDinheiro += clienteAtual.getValorgasto();
        
        clienteAtual = filaMercado.remove();
        clienteAtual.setHoraatendimento(12);
        clienteAtual.setMinutoatendimento(05);
        clienteAtual.setValorgasto(1200.00);
        System.out.println("O atendimento de " + clienteAtual.getNome() + 
                            " se iniciou as " + Integer.toString(clienteAtual.getHoraatendimento()) +
                            ":" + Integer.toString(clienteAtual.getMinutoatendimento()) +
                            " e durou 45 minutos, o valor gasto foi de " +
                            Double.toString(clienteAtual.getValorgasto()));
        totalMinutos += 45;
        totalDinheiro += clienteAtual.getValorgasto();
        
        System.out.println("O total gasto foi de R$" + Float.toString(totalDinheiro));
        System.out.println("O total de minutos gasto foi de: " + Integer.toString(totalMinutos));
    }
}
