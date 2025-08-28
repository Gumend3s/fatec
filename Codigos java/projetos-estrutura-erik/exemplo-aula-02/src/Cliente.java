import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Cliente extends Pessoa{
    int idade;
    int cpf;
    int cartão;
    private List<Produto> produtos;

    public Cliente(String nome, LocalDate data_nasci, int cpf, int cartão, List<Produto> produtos) {
        super(nome, data_nasci);
        this.cpf = cpf;
        this.cartão = cartão;
        this.produtos = produtos;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public int getIdade() {
        idade = Period.between(data_nasci, LocalDate.now()).getYears();
        return idade;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getcartão() {
        return cartão;
    }
    public void setCartão(int cartão) {
        this.cartão = cartão;
    }
    
}
