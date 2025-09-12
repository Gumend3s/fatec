/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploaula07;

/**
 *
 * @author gustavo.oliveira262
 */
public class Calculadora {
    
    private int n1;
    private int n2;
    
    public Calculadora(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public int soma() {
        return n1 + n2;
    }
    
    public int divide() {
        return n1 / n2;
    }
    
    
}
