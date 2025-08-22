
package exemploaula02;

/**
 *
 * @author gustavo.oliveira262
 */
public class TV {
    
    //atributos
    private String marca;
    private boolean ligada;
    private int canal;
    private int volume;

    // métodos
    public TV(String marca){
        this.marca = marca;
        this.ligada = false;
        this.canal = -1;
        this.volume = -1;
    }
    
    public TV(String marca, int canal, int volume){
        this.marca = marca;
        this.ligada = true;
        this.canal = canal;
        this.volume = volume;
    }

    public void ligarTV(){
        this.ligada = true;
        this.canal = 500;
        this.volume = 10;
    }

    public void desligarTV(){
        ligada = false;
    }

    public void mostrarTV(){

        if(ligada){
            System.out.println("TV ligada!!");
        }else{
            System.out.println("TV desligada!!");
        }
        System.out.println("Marca: " + marca);
        
        if (ligada) {
            System.out.println("Volume: " + volume);
            System.out.println("Canal: " + canal);
        }
    }
    
    @Override
    public String toString() {
        if(this.ligada) {
            return this.marca + ", " 
                 + this.canal + ", "
                 + this.volume;
        }
        else {
            return "TV desligada";
        }
    }
    
    public int getCanal() {
        return canal;
    }
    
    public void setCanal(int canal){
        if (this.ligada && canal >= 1 && canal <= 700) {
            this.canal = canal;
        }
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void aumentarVolume(){
        if (this.ligada && volume < 100) {
            volume++;
        }
    }
    
    public void diminuirVolume(){
        if (this.ligada && volume > 0) {
            volume--;
        }
    }
}
