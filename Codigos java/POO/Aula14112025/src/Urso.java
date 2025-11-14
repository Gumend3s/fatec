import java.util.Random;
public class Urso extends Animal{
    String cordopelo;
    float alturaempe;
    boolean imberna;
    Random posibilidade = new Random();
    public Urso(String nome, int idade, String cordopelo, float alturaempe, boolean imberna) {
        super(nome, idade);
        this.cordopelo = cordopelo;
        this.alturaempe = alturaempe;
        this.imberna = imberna;
    }

    public void secaPelo(){
    System.out.println("Eles esta se balancado...");
    System.out.println("Os pelo "+ this.cordopelo +" esta ceco");
    }

    public void ficarDePe(){
        System.out.println("O Urso Ficou de pe...");
        System.out.println("Agora ele parece ter "+ this.alturaempe +" metros de altura!!!");
    }

    public void qualeEstacao(String estacao){
        estacao.toLowerCase();
        if(estacao=="inverno"){
            this.imberna = true;
            System.out.println("ele ta dormido");
            this.Dormi();
            System.out.println("Estamos de boas so nao fazer barulho");
        }else{
            this.imberna=false;
            int chance = posibilidade.nextInt(100);
            System.out.println("ele ta acordado...nao faz barulho...\n");
            if (chance<49) {
                System.out.println("...(barulho de galho)!!!! CORRE ELE VIU A GENTE!!!\n");
                ficarDePe();
                emetirSom();
                seMover();
            } else {
                System.out.println("...");
                System.out.println("saimos de boas... que sorte");
            }
        }
    }

    @Override
    public void comer() {
        int chance = posibilidade.nextInt(100);
        if (chance<49) {
            System.out.println("O urso de azar e so comeu frutas");
        }else{
            System.out.println("O urso esta comendo seu banquete de salmao e frutas");
        }
    }


    @Override
    public void emetirSom() {
        System.out.println("ruuu..roar....ruuu");
    }

    @Override
    public void nascer() {
        System.out.println("O pequeno urso saiu da barriga da sua mae urso");
    }

    @Override
    public void seMover() {
        System.out.println("O urso esta correndo com sua 4 patas");
    }

    public void imberna(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imberna'");
    }  

}
