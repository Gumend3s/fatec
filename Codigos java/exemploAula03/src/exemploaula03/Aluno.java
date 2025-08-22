/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploaula03;

/**
 *
 * @author gustavo.oliveira262
 */
public class Aluno extends PessoaFisica {
    private int RA;
    
    public Aluno(String nome, int CPF, int RA) {
        super(nome, CPF);
        this.RA = RA;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }
}
