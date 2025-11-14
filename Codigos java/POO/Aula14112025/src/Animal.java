public abstract class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void Dormi() {
        System.out.println("..zzz.z...zzzz...zzZZ");
    }

    public abstract void comer();

    public abstract void emetirSom();

    public abstract void nascer();

    public abstract void seMover();



}
