import java.time.LocalDate;

class Desenvolvedor extends Funcionario{

    String cargo;
    boolean acessobanco;
    boolean acessodesenvolvimento;
    boolean acessoirrestrito;

    public Desenvolvedor(String nome, int cpf, int salario, LocalDate datadeadmissao, String cargo, boolean acessobanco,
            boolean acessodesenvolvimento, boolean acessoirrestrito) {
        super(nome, cpf, salario, datadeadmissao);
        this.cargo = cargo;
        this.acessobanco = acessobanco;
        this.acessodesenvolvimento = acessodesenvolvimento;
        this.acessoirrestrito = acessoirrestrito;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isAcessobanco() {
        return acessobanco;
    }
    public void setAcessobanco(boolean acessobanco) {
        this.acessobanco = acessobanco;
    }

    public boolean isAcessodesenvolvimento() {
        return acessodesenvolvimento;
    }
    public void setAcessodesenvolvimento(boolean acessodesenvolvimento) {
        this.acessodesenvolvimento = acessodesenvolvimento;
    }

    public boolean isAcessoirrestrito() {
        return acessoirrestrito;
    }
    public void setAcessoirrestrito(boolean acessoirrestrito) {
        this.acessoirrestrito = acessoirrestrito;
    }
}
