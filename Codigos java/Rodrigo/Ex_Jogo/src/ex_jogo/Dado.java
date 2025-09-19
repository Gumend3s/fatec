package ex_jogo;

import java.util.Random;

public class Dado extends jogo{
    
    @Override
    public void setAposta(int aposta){
        if(aposta> 6 || aposta < 1){
            System.out.println("Valor invalido");
        } else{
            super.setAposta(aposta);
        }
    }
    
    
    @Override
    public void setResultado(int resultado) {
        System.out.println("Sei o que você esta fazendo");
    }
    
    @Override
    public void jogaJoga(){
        int resultado;
        
        Random dado = new Random();
        resultado = dado.nextInt(6) + 1;
        
        super.setResultado(resultado);
    }
}
