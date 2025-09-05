public class Quadrado extends Poligono{
    private double tamanholado;

    public Quadrado(int numLados, double tamanholado) {
        super(numLados);
        this.tamanholado = tamanholado;
    }

    public double getTamanholado() {
        return tamanholado;
    }

    public void setTamanholado(double tamanholado) {
        this.tamanholado = tamanholado;
    }
    
    @Override
    public float calcularArea() {
        float area = numLados * numLados;
        return area;
    }

    

}
