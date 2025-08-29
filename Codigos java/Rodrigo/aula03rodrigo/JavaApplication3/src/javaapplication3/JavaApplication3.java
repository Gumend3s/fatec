package javaapplication3;

public class JavaApplication3 {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Maria", 2222 );
        Aluno a2 = new Aluno("José", 3333);
        Professor p1 = new Professor("Marcel", 4444);
        
        System.out.println("Professor");
        p1.mostrar();
        
        System.out.println("Aluno a1");
        a1.mostrar();
                
        System.out.println("Aluno a2");
        a2.mostrar();
    }
}
