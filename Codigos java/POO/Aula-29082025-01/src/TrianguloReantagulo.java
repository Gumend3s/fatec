public class TrianguloReantagulo extends Triangulo implements Retangulo {

    private double catetosAdj;
    private double catetosOpt;
    
    public TrianguloReantagulo(int numLados, float base, float altura, boolean triangulo, double catetosAdj,
            double catetosOpt) {
        super(numLados, base, altura, triangulo);
        this.catetosAdj = catetosAdj;
        this.catetosOpt = catetosOpt;
    }
    
    public TrianguloReantagulo(int numLados, boolean triangulo, double catetosAdj,
    double catetosOpt){
        super(numLados,triangulo);
        this.catetosAdj = catetosAdj;
        this.catetosOpt = catetosOpt;
    }

    public double getCatetosAdj() {
        return catetosAdj;
    }

    public double getCatetosOpt() {
        return catetosOpt;
    }

    @Override
    public double calcularHipotenusa() {

        double hipotenuas = Math.sqrt((catetosAdj * catetosAdj) + (catetosOpt * catetosOpt));
        return hipotenuas;
    }

    @Override
    public void setCatetos(double catetosAdj, double catetosOpt){
        this.catetosAdj = catetosAdj;
        this.catetosOpt = catetosOpt;
    }
}
