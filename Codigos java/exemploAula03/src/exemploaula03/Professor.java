/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploaula03;

/**
 *
 * @author gustavo.oliveira262
 */
public class Professor extends PessoaFisica {
    private int matricula;
    
    public Professor(String nome, int CPF, int matricula) {
        super(nome, CPF);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
