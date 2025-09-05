package diagrama;

public class Diagrama {

    public static void main(String[] args) {
        LinguagemProgramacao lp1 = new LinguagemProgramacao();
        
        lp1.setCodigo(123);
        lp1.setLaboratorio("01");
        
        System.out.println(lp1.obterLaboratorio);
        System.out.println("Media = " +
                lp1.calcularMedia());
    }
    
}
