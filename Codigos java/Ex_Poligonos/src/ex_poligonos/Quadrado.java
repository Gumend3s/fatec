/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_poligonos;

/**
 *
 * @author gustavo.oliveira262
 */
public class Quadrado extends Poligono {
    double tamanhoLado;
    
    public Quadrado(double tamanhoLado) {
        super(4);
        this.tamanhoLado = tamanhoLado;
    }

    public double getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }
    
    @Override
    public double calcularArea() {
        return tamanhoLado * tamanhoLado;
    }
}
