import javax.lang.model.element.QualifiedNameable;

public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado(4, 9);
        Triangulo triangulo = new Triangulo(3, 5, 10, true);
        TrianguloReantagulo trianguloReantagulo = new TrianguloReantagulo(3, true, 5, 8);
        System.out.println("Quadrado: "+"\n Quandos Lados: "+
            quadrado.getNumLados()+" "+ "\n Tamanho Lados: " +
            quadrado.getTamanholado()+" "+ "\n Area: " +
            quadrado.calcularArea()
        );
        System.out.println("Triangulo: " + "\n Quandos Lados: " +
            triangulo.getNumLados() + " " + "\n Tamanho Altura: " +
            triangulo.getAltura() + "\n Tamanho Base: " +
            triangulo.getBase() + " " + "\n Area: " +
            triangulo.calcularArea()
        );
        System.out.println("Triangulo: " + "\n Quandos Lados: " +
            trianguloReantagulo.getNumLados() + " " + "\n Tamanho Altura: " +
            trianguloReantagulo.getCatetosAdj() + "\n Tamanho Base: " +
            trianguloReantagulo.getCatetosOpt() + " " + "\n Area: " +
            trianguloReantagulo.calcularHipotenusa()
        );
    }
}
