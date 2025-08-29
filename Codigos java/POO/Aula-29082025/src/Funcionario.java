import java.time.LocalDate;

abstract class Funcionario {
    String nome;
    int cpf;
    float salario;
    LocalDate datadeadmissao;

    
    public Funcionario(String nome, int cpf, float salario, LocalDate datadeadmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.datadeadmissao = datadeadmissao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public float getSalario() {
        return salario;
    }

    public float calcularSalario(float horasExtra,float DescontosCLT,float salarioFixo){
        float salario;

        salario = horasExtra+ salarioFixo - DescontosCLT;

        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public LocalDate getDatadeadmissao() {
        return datadeadmissao;
    }
    public void setDatadeadmissao(LocalDate datadeadmissao) {
        this.datadeadmissao = datadeadmissao;
    }

}
