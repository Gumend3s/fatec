/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_2;

import java.util.Stack;
import java.util.function.IntBinaryOperator;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.oliveira262
 */
public class Exercicio_2 {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
        
        Stack p = new Stack();
        do {
            p.push(num%2);
            num /= 2;
        } while(num > 0);
        
        String res = "";
        while(!p.isEmpty()) {
            res += p.pop();
        }
        
        JOptionPane.showMessageDialog(null, res);
    }
}
