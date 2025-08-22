/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadetv;

public class AtividadeTV {
    public static void main(String[] args) {
        TV tvSala = new TV("LG");
        TV tvQuarto = new TV("Sony", 100, 5);
        
        tvSala.ligarTV();
/*        tvSala.setCanal(555);
        tvQuarto.setCanal(150);
        tvSala.diminuirVolume();
        tvQuarto.desligarTV();
        tvSala.mostrarTV();
 */       tvQuarto.mostrarTV();
        System.out.println(tvSala.toString());
        System.out.println(tvQuarto.toString());
    }
}
