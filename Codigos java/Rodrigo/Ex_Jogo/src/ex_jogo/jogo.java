package ex_jogo;

public abstract class jogo {
    private int aposta;
    private int resultado;

    public int getAposta() {
        return aposta;
    }

    public void setAposta(int aposta) {
        this.aposta = aposta;
    }

    public void getResultado(int resultado) {
        this.resultado = resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public abstract void jogaJoga();
    
    public void mostraResultado(){
        System.out.println("Aposta: " + this.aposta);
        System.out.println("Resultado: " + this.resultado);
        if(this.aposta == this.resultado){
            System.out.println("Meus parabens, a proxima voce tambem consegue!!!!");
        } else {
            System.out.println("Tenta que vai!");
        }
    }
    
}
