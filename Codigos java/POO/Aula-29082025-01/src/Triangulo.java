public class Triangulo extends Poligono{
    float base;
    float altura;
    boolean triangulo;

    public Triangulo(int numLados, float base, float altura, boolean triangulo) {
        super(numLados);
        this.base = base;
        this.altura = altura;
        this.triangulo = triangulo;
    }
    
    public Triangulo(int numLados, boolean triangulo) {
        super(numLados);
        this.triangulo = triangulo;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void trianguloVer(){
        if (numLados==3){
            triangulo = true;
        }else{
            triangulo = false;
        }
    }

    @Override
    public float calcularArea(){
        float area = (base*altura)/2;
        return area;
    }
}
