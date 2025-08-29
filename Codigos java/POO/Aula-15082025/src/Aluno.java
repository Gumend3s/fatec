public class Aluno extends Pessoas{
    private int ra;

    public Aluno(String nome, int idade, int ra) {
        super(nome, idade);
        this.ra = ra;
    }
    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }
    
    public void Perfil(){

        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("RA: " + getRa());
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
    }

}