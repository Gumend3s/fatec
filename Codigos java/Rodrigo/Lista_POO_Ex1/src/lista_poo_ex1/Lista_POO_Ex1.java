package lista_poo_ex1;

public class Lista_POO_Ex1 {

    public static void main(String[] args) {
        Disciplina a1 = new Disciplina("Jose", 22, 6, 6, 2);
    
        System.out.println("Media: " + String.format("%.2f", a1.media()));
        System.out.println("Faltam: " + String.format("%.2f", a1.notaFinal()));
    
    }
    
}
