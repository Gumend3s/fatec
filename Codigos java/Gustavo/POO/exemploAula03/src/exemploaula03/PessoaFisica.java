/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploaula03;

/**
 *
 * @author gustavo.oliveira262
 */
public class PessoaFisica extends Pessoa {
    private int CPF;
    
    public PessoaFisica(String nome, int CPF) {
        super(nome);
        this.CPF = CPF;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    
    public void mostrar() {
        System.out.println("Nome: " +
                this.getNome() +
                "\nCPF: " +
                this.getCPF());
    }
}
