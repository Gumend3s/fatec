import java.time.LocalDate;

class Designer extends Funcionario{
    
    int numeroProjetos;
    String nivelSenirioridade;
    boolean ativo;
    
    public Designer(String nome, int cpf, int salario, LocalDate datadeadmissao, int numeroProjetos,
            String nivelSenirioridade, boolean ativo) {
        super(nome, cpf, salario, datadeadmissao);
        this.numeroProjetos = numeroProjetos;
        this.nivelSenirioridade = nivelSenirioridade;
        this.ativo = ativo;
    }

    public int getNumeroProjetos() {
        return numeroProjetos;
    }
    public void setNumeroProjetos(int numeroProjetos) {
        this.numeroProjetos = numeroProjetos;
    }
    public String getnivelSenirioridade() {
        return nivelSenirioridade;
    }
    public void setnivelSenirioridade(String nivelSenirioridade) {
        this.nivelSenirioridade = nivelSenirioridade;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
