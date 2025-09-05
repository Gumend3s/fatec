package exaula04;

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
