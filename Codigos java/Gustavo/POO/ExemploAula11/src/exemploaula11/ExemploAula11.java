/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploaula11;

import java.util.LinkedList;
import java.util.List;

class Animal {
    public void andar() {
        System.out.println("Anda como um animal generico");
    }
}

class Arara extends Animal {
    public void andar() {
        System.out.println("Voa como uma arara");
    }
}

class Urso extends Animal {
    public void andar() {
        System.out.println("Anda como um urso");
    }
}

class Cobra extends Animal {
    public void andar() {
        System.out.println("Rasteja como uma cobra");
    }
    
    public void morder() {
        System.out.println("Morde como uma cobra");
    }
}


/**
 *
 * @author gustavo.oliveira262
 */
public class ExemploAula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Animal> animais = new LinkedList<Animal>();
        
        animais.add(new Arara());
        animais.add(new Urso());
        animais.add(new Cobra());
        animais.add(new Animal());
        
        for(Animal a: animais) {
            a.andar();
            
            if(a instanceof Cobra) {
                // Dowcasting
                // Cobra c = (Cobra) a;
                // c.morder();
                ((Cobra) a).morder();
            }
        }
    }
    
}
