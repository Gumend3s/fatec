package lista_poo_ex1;

public class Disciplina {
    private int matricula;
    private String nome;
    private double p1;
    private double p2;
    private double trabalho;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }
    
    public Disciplina(String nome, int matricula, double p1, double p2, double trabalho){
        this.nome = nome;
        this.matricula = matricula;
        this.p1 = p1;
        this.p2 = p2;
        this.trabalho = trabalho;
    }
    
    public double media(){
        return (((this.p1 + this.p2) * 2.5) + (this.trabalho * 2)) / 7;
    }
    public double notaFinal(){
    double media = media();
        if(media >= 6)
            return 0;
        else{
            return 6 - media;
        }
            
    }
}
