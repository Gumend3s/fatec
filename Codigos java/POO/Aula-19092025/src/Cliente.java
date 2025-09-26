import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private String cpf;
    private List <Conta> contas;
    private Banco banco;


    public Cliente(String nome, String cpf, Banco banco) {
        this.nome = nome;
        this.cpf = cpf;
        this.banco = banco;
    }
    
    public Cliente( Banco banco) {
        this.banco = banco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void criar( double saldo, int numeroConta, Banco banco){

        try {
            Conta novConta = new Conta(numeroConta, saldo, this.cpf, this.banco);

            this.contas.add(novConta);
            JOptionPane.showMessageDialog(null, "A sua nova conta foi criada com o saldo " + saldo +" com o numero "+ numeroConta+ "no banco "+ banco );
        } catch (Exception e) {
            this.contas = new ArrayList<>();

            Conta novConta = new Conta(numeroConta, saldo, this.cpf, this.banco);

            this.contas.add(novConta);
            JOptionPane.showMessageDialog(null,"Vimos que você é novo aqui?!!");
            JOptionPane.showMessageDialog(null, "A sua primeira conta foi criada com o saldo " + saldo + " e com o numero " + numeroConta
                    + "no banco " + banco );
        }


    }







}
