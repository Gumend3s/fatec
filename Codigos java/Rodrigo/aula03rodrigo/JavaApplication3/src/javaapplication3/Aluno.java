package javaapplication3;

public class Aluno extends PessoaFisica {
    private int ra;
    
    public Aluno(String nome, int cpf) {
        super(nome, cpf);
        this.ra = -1;
    }
        
    public Aluno(String nome, int cpf, int ra) {
        super(nome, cpf);
        this.ra = ra;
    }
    public int getRa(){
    return ra;
    }
    
    public void setRa(int ra){
        this.ra = ra;
    }
    @Override
    public void mostrar(){
        super.mostrar();
    System.out.println("Ra: " +
            this.getRa());
    }
}
