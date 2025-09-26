package ex_animal;

public abstract class Animal {
    protected int idade;
    protected String nome;
    protected static int contadorAnimais;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract void emitirSom();
    
    public void obterInfo(){
        System.out.println("Nome: " + 
                            this.nome +
                            "\nIdade: " +
                            this.idade);
    }
    public static int contadorAnimais(){
        return contadorAnimais;
    }
}
