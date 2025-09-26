/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_animal;

/**
 *
 * @author gustavo.oliveira262
 */
public class Ex_Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Cachorro c1 = new Cachorro("Lina", "Caramelo", -4);
            Cachorro c2 = new Cachorro("Belinha", "SRD", 13);   

            System.out.println(Animal.obterContadorAnimais());

            Gato g1 = new Gato("Mingau", "Branco", 7);

            System.out.println(Animal.obterContadorAnimais());

            System.out.println(c1.obterInfo());
            System.out.println(c2.obterInfo());
            System.out.println(g1.obterInfo()); 
        } catch(IdadeInvalidaException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
    
}
