package exaula04;

public class TrianguloRetangulo 
        extends Triangulo 
        implements Retangulo
{
        double catetoAdj;
        double catetoOpo;
        
    public TrianguloRetangulo(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public void setCatetos(double catetoAdj, double catetoOpo) {
        this.catetoAdj = catetoAdj;
        this.catetoOpo = catetoOpo;
    }
    
    @Override
    public double calcularHipotenusa() {
        return Math.hypot(catetoAdj, catetoOpo);
    }
}
