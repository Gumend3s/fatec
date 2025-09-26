package ex_jogo;

public class Ex_Jogo {

    public static void main(String[] args) {
        Dado d1 = new Dado();
        Roleta r1 = new Roleta();
        
        d1.setAposta(4);
        d1.jogaJoga();
        d1.mostraResultado();
        
        r1.setAposta(10);
        r1.jogaJoga();
        r1.mostraResultado();
        
    }
    
}
