/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploaula13;

/**
 *
 * @author gustavo.oliveira262
 */
public class ExemploAula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caixa<Integer> cx1 = new Caixa<Integer>();
        Caixa<String> cx2 = new Caixa<String>();
        Caixa<Sapato> cx3 = new Caixa<Sapato>();
        
         cx1.guardar(1);
         System.out.println(cx1.devolver());
         
         cx2.guardar("Bom dia");
         System.out.println(cx2.devolver());
         
         cx3.guardar(new Sapato(42, "Nike", "Preto"));
         System.out.println(cx3.devolver().toString());
    }
    
}
