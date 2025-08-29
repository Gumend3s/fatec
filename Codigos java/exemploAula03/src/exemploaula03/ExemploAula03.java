/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploaula03;

/**
 *
 * @author gustavo.oliveira262
 */
public class ExemploAula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Maria", 22222, 2025002);
        Aluno a2 = new Aluno("Jose", 33333);
        Professor p1 = new Professor("Marcelo", 555555, 18275343);
        
        System.out.println("Aluno 1:");
        a1.mostrar();
        
        System.out.println("Aluno 2:");
        a2.mostrar();
        
        System.out.println("Professor 2");
        p1.mostrar();
    }
    
}
