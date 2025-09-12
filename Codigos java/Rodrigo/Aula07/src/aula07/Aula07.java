package aula07;


public class Aula07 {

    public static void main(String[] args) {
        String aux;
        int num1, num2;
        int somado, dividido;
        
        try{
        aux = JOptionPane.showImputDialog("Digite nro1: ");
        num1 = Integer.parseInt(aux);

        aux = JOptionPane.showImputDialog("Digite nro2: ");
        num2 = Integer.parseInt(aux);
        
        Calculadora calc = new Calculadora(num1, num2);
        
        somado = calc.soma():
        dividido = calc.divide();
        
        } catch (NumberFormatExeption e) {
            JOptionPane.showMessageDialog(null, 
                    "Erro de conversão!\n" + 
                    e.toString(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticExeption e){
            JOptionPane.showMessageDialog(null, 
                    "Erro de divisão por zero!\n" + 
                    e.toString(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exeption e) {
            JOptionPane.showMessageDialog(null, 
                    "Erro genérico!\n" + 
                    e.toString(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
