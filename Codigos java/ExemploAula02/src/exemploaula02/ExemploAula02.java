/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploaula02;

/**
 *
 * @author gustavo.oliveira262
 */
public class ExemploAula02 {
    
    public static void main(String[] args) {
        TV tvSala = new TV("LG");
        TV tvQuarto = new TV("Sony", 500, 100);
        
        tvSala.ligarTV();
        tvSala.setCanal(200);
        tvSala.aumentarVolume();
        
        tvSala.mostrarTV();
        tvQuarto.mostrarTV();
        
        System.out.println(tvSala.toString());
    }
}