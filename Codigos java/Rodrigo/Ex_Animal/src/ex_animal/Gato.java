package ex_animal;

public class Gato extends Animal{
    private String raca;
    
    public Gato(String nome, String raca,int idade ){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        contadorAnimais++;
    }
            
    @Override
    public void emitirSom(){
        System.out.println("Miau Miau MIGGA!!");
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
