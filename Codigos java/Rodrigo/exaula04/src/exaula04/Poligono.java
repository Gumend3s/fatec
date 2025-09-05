package exaula04;

public abstract class Poligono {
    int numLados;
    
    public Poligono(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
    
    public abstract double calcularArea();
    
}
