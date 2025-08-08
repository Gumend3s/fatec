package exemploaula01;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.oliveira262
 */
public class ExemploAula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base, altura, area;
        String aux;
        
        /*
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a base: ");
        base = sc.nextFloat();
        
        System.out.print("Digite a altura: ");
        altura = sc.nextFloat();
        
        area = potencia(base,altura);
        
        System.out.println("Area = " + area);
        */
        
        aux = JOptionPane.showInputDialog("Digite a base");
        base = Float.parseFloat(aux);
        
        aux = JOptionPane.showInputDialog("Digite a altura");
        altura = Float.parseFloat(aux);
        
        area = base * altura;
        JOptionPane.showMessageDialog(null, "Area = " + area);
        
        /*
        float coef, exp, pot;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o coeficiente: ");
        coef = sc.nextFloat();
        
        System.out.print("Digite o expoente: ");
        exp = sc.nextFloat();
        
        pot = potencia(coef, exp);
        
        System.out.println("Potencia = " + pot);
        */
    }
    /*
    public static float potencia(float coeficiente, float expoente){
        if (expoente == 0) return 1;
        return coeficiente * potencia(coeficiente, expoente - 1);
    }
    */
}
