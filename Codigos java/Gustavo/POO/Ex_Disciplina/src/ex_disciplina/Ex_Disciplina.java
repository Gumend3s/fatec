/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_disciplina;

/**
 *
 * @author gustavo.oliveira262
 */
public class Ex_Disciplina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinguagemProgramacaoI lp1 = new LinguagemProgramacaoI();
        lp1.setCodigo(123);
        lp1.setLaboratorio("01");
        
        System.out.println(lp1.obterLaboratorio());
        System.out.println("Media = " + lp1.calcularMedia());
    }
    
}
