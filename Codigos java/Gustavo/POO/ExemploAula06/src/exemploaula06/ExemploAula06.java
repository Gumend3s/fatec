/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploaula06;

/**
 *
 * @author gustavo.oliveira262
 */
public class ExemploAula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado e1 = new Empregado("Jose");
        Empregado e2 = new Empregado("Maria");
        Empregado e3 = new Empregado("Carlos");
        
        e1.setDepartamento("T.I.");
        e1.setSalario(7000);
        
        e2.setDepartamento("Vendas");
        e2.setSalario(9000);
        
        e3.setDepartamento("R.H.");
        e3.setSalario(5000);
        
        // função chamada pela instância
        e1.mostrarEmpregado();
        e2.mostrarEmpregado();
        e3.mostrarEmpregado();
        
        // função estática chamada pela classe em sim
        Empregado.mostrarEmpregado(e1);
        Empregado.mostrarEmpregado(e2);
        Empregado.mostrarEmpregado(e3);
    }
    
}
