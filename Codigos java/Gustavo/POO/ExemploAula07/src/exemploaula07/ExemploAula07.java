/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploaula07;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.oliveira262
 */
public class ExemploAula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String aux;
        int num1, num2;
        int somado;
        float dividido;
        
        try {
            aux = JOptionPane.showInputDialog("Digite o primeiro numero");
            num1 = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Digite o segunco numero");
            num2 = Integer.parseInt(aux);
            
            Calculadora calc = new Calculadora(num1, num2);
            
            somado = calc.soma();
            dividido = calc.divide();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                    "Erro de covnversao\n" +
                    e.toString(), "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, 
                    "Divisao por zero\n" +
                    e.toString(), "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                    "Erro generico\n" +
                    e.toString(), "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            System.out.println("Terminou");
        }
    }
    
}
