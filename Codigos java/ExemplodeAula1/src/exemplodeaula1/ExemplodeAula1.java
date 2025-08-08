
package exemplodeaula1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo.toledo3
 */
public class ExemplodeAula1 {

    public static void main(String[] args) {
        float base, altura, area;
        String aux;
        
        
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Digite a base: ");
//        base = sc.nextFloat();
//        
//        System.out.println("Digite a altura: ");
//        altura = sc.nextFloat();
//        area = base * altura;
//        System.out.println("Area = ");
        
        aux = JOptionPane.showInputDialog("Digite a Base: ");
        base = Float.parseFloat(aux);
        
        aux = JOptionPane.showInputDialog("Digite a Base: ");
        altura = Float.parseFloat(aux);
        
        area = base * altura;
        JOptionPane.showMessageDialog(null, "Area = ");
    }
}
