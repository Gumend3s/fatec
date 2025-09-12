/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_disciplina;

/**
 *
 * @author gustavo.oliveira262
 */
public class LinguagemProgramacaoI 
        extends Disciplina 
        implements Pratica 
{
    private String laboratorio;

    public LinguagemProgramacaoI() {
        System.out.println("Objeto LP-I criado");
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
    
    @Override
    public String obterLaboratorio() {
        return "Lab. " + this.laboratorio;
    }
    
    @Override
    public float calcularMedia() {
        String entrada;
        float p1, p2;
        
        return 0;
    }
}
