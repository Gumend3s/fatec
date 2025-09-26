package ex_animal;

public class Cachorro extends Animal{
    private String raca;
    
    public Cachorro(String nome, String raca,int idade ){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        contadorAnimais++;
    }
            
    @Override
    public void emitirSom(){
        System.out.println("AU AU!!");
    }
    
    @Override
    public void obterInfo(){
        System.out.println("Nome: " + 
                            this.nome +
                            "\nIdade: " +
                            this.idade +
                            "\nRaca: " +
                            this.raca + 
                            "\n");
    }
}
