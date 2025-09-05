package exaula04;

public class Exaula04 {

    public static void main(String[] args){
            Quadrado q1 = new Quadrado(3);
            Triangulo t1 = new Triangulo(5, 10);
            
            System.out.println("Area do quadrado: " +
                    q1.calcularArea() +
                    "\nArea do Triangulo = " +
                    t1.calcularArea());
                    
            TrianguloRetangulo tr1 = new TrianguloRetangulo(3, 4);
            tr1.setCatetos(6, 5);
            
            System.out.println("Area do Triangulo Retangulo: " +
            tr1.calcularArea());
    }
}
