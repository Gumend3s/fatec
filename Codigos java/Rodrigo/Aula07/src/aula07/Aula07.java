package aula07;

import javax.swing.JOptionPane;

public class Aula07 {

    public static void main(String[] args) {
        String aux;
        int num1, num2;
        int somado, dividido;
        
        try{
        aux = JOptionPane.showInputDialog("Digite nro1: ");
        num1 = Integer.parseInt(aux);

        aux = JOptionPane.showInputDialog("Digite nro2: ");
        num2 = Integer.parseInt(aux);
        
        Calculadora calc = new Calculadora(num1, num2);
        
        somado = calc.soma();
        dividido = calc.divide();
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                    "Erro de conversão!\n" + 
                    e.toString(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, 
                    "Erro de divisão por zero!\n" + 
                    e.toString(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                    "Erro genérico!\n" + 
                    e.toString(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
