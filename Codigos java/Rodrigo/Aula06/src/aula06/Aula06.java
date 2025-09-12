package aula06;

public class Aula06 {

    public static void main(String[] args) {
        Empregado e1 = new Empregado("Jose");
        Empregado e2 = new Empregado("Maria");
        Empregado e3 = new Empregado("Carlos");
        
        e1.setDepartamento("T.I.");
        e1.setSalario(7000);
        
        e2.setDepartamento("Vendas");
        e2.setSalario(9000);
        
        e3.setDepartamento("R.H.");
        e3.setSalario(10000);
        
        e1.mostrarEmpregado();
        e2.mostrarEmpregado();
        e3.mostrarEmpregado();
        
        Empregado.totalEmpregado();
    }
    
}
