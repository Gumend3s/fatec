package ex_animal;

public class Ex_Animal {

   public static void main(String[] args) {
       Cachorro c1 = new Cachorro("Max", "Pitbull", 3);
       Cachorro c2 = new Cachorro("Bartolomeu", "Sao Bernardo", 6);
       
       Gato g1 = new Gato("Garfield", "Laranja", 8);
       Gato g2 = new Gato("Duende", "Cotoco", 3);
       
       c1.obterInfo();
       c2.obterInfo();
       g1.obterInfo();
       g2.obterInfo();
   }
    
}
