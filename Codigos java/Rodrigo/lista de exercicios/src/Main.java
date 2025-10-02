import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Data d1 = new Data(
                Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Digite o mes: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: ")),
                JOptionPane.showInputDialog("Digite o mes por extenso: "));


        JOptionPane.showMessageDialog(null, "Dia: " +
                d1.getDia() +
                "\nMes: " +
                d1.getMes() +
                "   " +
                d1.getMesExtenso() +
                "\nAno: " +
                d1.getAno());
    }
}
