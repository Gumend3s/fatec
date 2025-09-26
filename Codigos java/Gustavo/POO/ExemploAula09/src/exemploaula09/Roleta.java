/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploaula09;

import java.util.Random;

/**
 *
 * @author gustavo.oliveira262
 */
public class Roleta extends Jogo {
    
    @Override
    public void setAposta(int aposta) {
        if(aposta > 37 || aposta < 0) {
            System.out.println("Valor invalido para a roleta");
        } else {
            super.setAposta(aposta);
        }
    }
    
    @Override
    public void setResultado(int resultado) {
        System.out.println("Pode roubar nao fi");
    }
    
    @Override
    public void jogaJogo() {
        int resultado;
        
        Random roleta = new Random();
        resultado = roleta.nextInt(37);
        
        super.setResultado(resultado);
    }
}
