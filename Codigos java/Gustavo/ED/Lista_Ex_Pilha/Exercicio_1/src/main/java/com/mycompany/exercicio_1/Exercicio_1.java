/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_1;

/**
 *
 * @author gustavo.oliveira262
 */
public class Exercicio_1 {

    public static void main(String[] args) {
        Pilha p1 = new Pilha(5);
        
        p1.push(1);
        p1.push(5);
        p1.push(7);
        
        System.out.println(p1.peek());
        System.out.println(p1.pop());
        System.out.println(p1.pop());
        System.out.println(p1.peek());
    }
}
