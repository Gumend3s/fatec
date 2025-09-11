/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_poligonos;

/**
 *
 * @author gustavo.oliveira262
 */
public class Ex_Poligonos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(3);
        System.out.println("Area quadrado: " + q1.calcularArea());
        
        TrianguloRetangulo tr1 = new TrianguloRetangulo(3, 4);
        System.out.println("Hipotenusa: " + tr1.calcularHipotenusa());
    }
    
}
