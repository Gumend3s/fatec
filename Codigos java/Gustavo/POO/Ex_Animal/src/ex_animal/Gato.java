/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_animal;

/**
 *
 * @author gustavo.oliveira262
 */
public class Gato extends Animal {
    
    String raca;
    
    public Gato(String nome, String raca, int idade) throws IdadeInvalidaException {
        super(nome, idade);
        
        this.raca = raca;
        
        super.contadorAnimais++;
    }
    
    @Override
    public String emitirSom() {
        return "Miado";
    }

    @Override
    public String obterInfo() {
        return this.nome + " " + this.raca + " " + this.idade;
    }
}
