package ex_jogo;

public class Ex_Jogo {

    public static void main(String[] args) {
        Dado d1 = new Dado();
        
        d1.setAposta(1);
        d1.jogaJoga();
        d1.setResultado(1);
        d1.mostraResultado();
        
    }
    
}
