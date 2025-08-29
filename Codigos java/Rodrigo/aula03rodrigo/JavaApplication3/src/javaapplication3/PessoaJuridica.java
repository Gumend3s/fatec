package javaapplication3;

public class PessoaJuridica extends Pessoa {
    private int cnpj;
    
    public PessoaJuridica(String nome) {
        super(nome);
        this.cnpj = cnpj;
    }
    
    public int getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
    
    public void mostrar(){
        System.out.println("Nome: " +
                this.getNome() +
                "\nCNPJ: " +
                this.getCnpj());
    }
        
}
