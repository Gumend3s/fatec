/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_animal;

/**
 *
 * @author gustavo.oliveira262
 */
public abstract class Animal {
    String nome;
    int idade;
    
    protected static int contadorAnimais = 0;
    
    protected Animal(String nome, int idade) throws IdadeInvalidaException{
        if (idade < 0) throw new IdadeInvalidaException();
        
        this.nome = nome;
        this.idade = idade;
        
        contadorAnimais++;
    }
    
    protected abstract String emitirSom();
    
    public String obterInfo() {
        return this.nome + " " + this.idade;
    }
    
    public static int obterContadorAnimais() {
        return contadorAnimais;
    }
}
