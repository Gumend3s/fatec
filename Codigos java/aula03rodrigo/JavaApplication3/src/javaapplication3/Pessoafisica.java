/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author rodrigo.toledo3
 */
public class Pessoafisica extends Pessoa{
    private String CPF;
    
    public Pessoafisica(String CPF, String nome){
        this.CPF = CPF;
        super(nome);
    }

}
