package ex_jogo;

import java.util.Random;

public class Roleta extends jogo{
    
    @Override
    public void setAposta(int aposta){
        if(aposta> 36 || aposta < 0){
            System.out.println("Valor invalido");
        } else{
            super.setAposta(aposta);
        }
    }
    
    @Override
    public void jogaJoga(){
        int resultado;
        
        Random dado = new Random();
        resultado = dado.nextInt(36);
        
        super.setResultado(resultado);
    }
}
