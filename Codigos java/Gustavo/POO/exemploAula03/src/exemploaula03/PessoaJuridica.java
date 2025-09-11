/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploaula03;

/**
 *
 * @author gustavo.oliveira262
 */
public class PessoaJuridica extends Pessoa {
    private int CNPJ;

    public PessoaJuridica(String nome, int CNPJ) {
        super(nome);
        this.CNPJ = CNPJ;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }
}
