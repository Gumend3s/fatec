import java.time.LocalDate;

abstract class Funcionario {
    String nome;
    int cpf;
    int salario;
    LocalDate datadeadmissao;

    
    public Funcionario(String nome, int cpf, int salario, LocalDate datadeadmissao) {
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
    
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public LocalDate getDatadeadmissao() {
        return datadeadmissao;
    }
    public void setDatadeadmissao(LocalDate datadeadmissao) {
        this.datadeadmissao = datadeadmissao;
    }

}
