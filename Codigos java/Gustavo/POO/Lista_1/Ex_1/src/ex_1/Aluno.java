/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_1;

/**
 *
 * @author gustavo.oliveira262
 */
public class Aluno {
    String nome;
    int matricula;
    float p1, p2, trabalho;
    
    public Aluno(String nome, int matricula, float p1, float p2, float trabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.p1 = p1;
        this.p2 = p2;
        this.trabalho = trabalho;
    }
    
    public void media() {
        System.out.println(String.format("A media do aluno e: %.2f", (((p1 + p2) * 2.5 + trabalho * 2) / 7)));
    }
}
