/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_contabancaria;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.oliveira262
 */

public class Ex_ContaBancaria {

    private static String menu = ""
            + "1 - Depositar\n"
            + "2 - Sacar\n"
            + "3 - Transferir\n"
            + "4 - Ver contas\n"
            + "5 - Criar conta\n"
            + "0 - Sair\n";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String entrada;
        int opcao = -1, selecionado, i;
        float valor;
        String aux;
        ContaBanco[] contas = new ContaBanco[5];
        contas[0] = new ContaBanco("Gustavo");
        contas[1] = new ContaBanco("Rodrigo");
        do
            try {
                selecionado = -1;
                
                entrada = JOptionPane.showInputDialog(menu);
                opcao = Integer.parseInt(entrada);
                
                switch (opcao) {
                    case 1:
                        selecionado = selecionarConta(contas);
                        if (selecionado != -1) {
                            valor = pegarValor();
                            contas[selecionado].depositar(valor);
                        }
                        break;
                    case 2:
                        
                        selecionado = selecionarConta(contas);
                        if (selecionado != -1) {
                            valor = pegarValor();
                            contas[selecionado].sacar(valor);
                        }
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        aux = "";
                        i = 1;
                        for(ContaBanco conta : contas) {
                            if(conta != null) {
                                aux += i + " - " + conta.getDono() + ": " + 
                                        String.format("%.2f", conta.getSaldo()) + "R$\n";
                                i++;
                            }
                        }
                        JOptionPane.showMessageDialog(null, aux);
                        break;
                    case 5:
                        
                        break;
                    case 0:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Valor inválido\n");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido\n");
            }
        while (opcao != 0);
    }
    
    static float pegarValor() {
        float valor = 0;
        try {
            valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor desejado"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido, operação cancelada\n");
        }
        return valor;
    }
    
    static int selecionarConta(ContaBanco[] contas) {
        int i = 1, selecionado = -1;
        String opcoes = "";
        for(ContaBanco conta : contas) {
            if(conta != null) {
                opcoes += i + " - " + conta.getDono() + "\n";
                i++;
            }
        }
        
        if (i > 1) {
            opcoes += "0 - Cancelar";
            try {
                selecionado = Integer.parseInt(JOptionPane.showInputDialog(opcoes)) - 1;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido, operação cancelada\n");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há contas existentes no sistema\n");
        }
        
        return selecionado;
    }
}
