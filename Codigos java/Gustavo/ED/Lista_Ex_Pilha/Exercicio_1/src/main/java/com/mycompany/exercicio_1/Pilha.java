/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_1;

/**
 *
 * @author gustavo.oliveira262
 */
public class Pilha {
    private int max;
    private int tam;
    private int[] p;
    
    public Pilha(int max) {
        this.max = max;
        p = new int[max];
        tam = 0;
    }
    
    public void push(int val) {
        p[tam++] = val;
    }
    
    public int pop() {
        return p[--tam];
    }
    
    public boolean isEmpty() {
        if(tam == 0) return true;
        return false;
    }
    
    public int peek() {
        return p[tam-1];
    }
}
