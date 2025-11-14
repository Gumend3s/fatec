/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploaula13;

/**
 *
 * @author gustavo.oliveira262
 */
public class Caixa<T> {
    private T valor;
    
    public void guardar(T valor) {
        this.valor = valor;
    }
    
    public T devolver() {
        return valor;
    }
    
    
    
    
}
