package javaapplication3;

public class Professor extends PessoaFisica{
    private int matricula;
    
    public Professor(String nome, int cpf) {
        super(nome, cpf);
        this.matricula = -1;
    }
        
    public Professor(String nome, int cpf, int matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }
    public int getMatricula(){
    return matricula;
    }
    
    public void setMatricula(int ra){
        this.matricula = matricula;
    }
    @Override
    public void mostrar(){
        super.mostrar();
    System.out.println("Ra: " +
            this.getMatricula());
    }
}
