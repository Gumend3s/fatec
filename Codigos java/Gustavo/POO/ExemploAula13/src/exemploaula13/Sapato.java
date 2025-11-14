/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploaula13;

/**
 *
 * @author gustavo.oliveira262
 */
public class Sapato {
    int tamanho;
    String modelo;
    String cor;
    
    public Sapato(int tamanho, String modelo, String cor) {
        this.tamanho = tamanho;
        this.modelo = modelo;
        this.cor = cor;
    }
    
    @Override
    public String toString() {
        return "Tamanho: " + this.tamanho +
               "Modelo: " + this.modelo +
               "Cor: " + this.cor;
    }
}
