package exemploaula09;

/**
 *
 * @author gustavo.oliveira262
 */
public abstract class Jogo {
    
    private int aposta;
    private int resultado;
    
    public void setAposta(int aposta) {
        this.aposta = aposta;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public abstract void jogaJogo();
    
    public void mostraResultado() {
        System.out.println("Aposta: " + this.aposta);
        System.out.println("Resultado: " + this.resultado);
        if(this.aposta == this.resultado) {
            System.out.println("Ganhou");
        } else {
            System.out.println("Tente novamente");
        }
    }
}
