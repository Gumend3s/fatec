import java.time.LocalDate;

public abstract class Pessoa {

    String Nome;
    String Endereco;
    String Estado;
    LocalDate DataNascimento;

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public LocalDate getDataNascimento() {
        return DataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        DataNascimento = dataNascimento;
    }
}
