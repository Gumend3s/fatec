/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_animal;

/**
 *
 * @author gustavo.oliveira262
 */
public class Cachorro extends Animal{
    
    String raca;
    
    public Cachorro(String nome, String raca, int idade) throws IdadeInvalidaException{
        super(nome, idade);
        
        this.raca = raca;
    }
    
    @Override
    public String emitirSom() {
        return "Latido";
    }

    @Override
    public String obterInfo() {
        return this.nome + " " + this.raca + " " + this.idade;
    }
}
