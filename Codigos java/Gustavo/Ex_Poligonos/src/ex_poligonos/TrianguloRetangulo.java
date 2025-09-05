/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_poligonos;

/**
 *
 * @author gustavo.oliveira262
 */
public class TrianguloRetangulo extends Triangulo implements Retangulo{
    double catetoAdj, catetoOpo;
    
    public TrianguloRetangulo(double base, double altura) {
        super(base, altura);
        setCatetos(base, altura);
    }
    
    @Override
    public void setCatetos(double catetoAdj, double catetoOpo) {
        this.catetoAdj = catetoAdj;
        this.catetoOpo = catetoOpo;
    }
    
    @Override
    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(catetoAdj, 2) + Math.pow(catetoOpo, 2));
    }
}
