/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadetv;

public class TV {
    //atributos
    private String marca;
    private boolean ligada;
    private int canal;
    private int volume;

    // métodos
    public TV(String m){
        marca = m;
        ligada = false;
        canal = -1;
        volume = -1;
    }
    
    public TV(String marca, int canal, int volume){
        this.marca = marca;
        this.canal = canal;
        this.volume = volume;
    }
    
    public void ligarTV(){
        ligada = true;
        this.canal = 500;
        this.volume = 10;
    }

    public void desligarTV(){
        ligada = false;
        this.canal = -1;
        this.volume = -1;       
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if(this.ligada && canal >= 1 && canal <= 1000){        
        this.canal = canal;
        }
    }
    
    public void mostrarTV(){
        if(ligada){
            System.out.println("TV ligada!!");
            System.out.println("Volume: " + volume);
            System.out.println("Canal: " + canal);
        }else{
            System.out.println("TV desligada!!");
        }
            System.out.println("Marca: " + marca);
    }
    public void diminuirVolume(){
        if(this.volume >= 1){
            this.volume = volume - 1;
        }
    }
        public void aumentarVolume(){
        if(this.volume <= 100){
            this.volume = volume + 1;
        }
    }
        @Override
        public String toString(){
            if(this.ligada){
            return this.marca + ", "
                    + this.canal + ", "
                    + this.volume + ", ";
            } else{
                return "TV desligada!"; 
            }
        }
}
