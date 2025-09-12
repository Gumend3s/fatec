package aula06;

public class Empregado {
    //Atributos de classe
    private static int proxCod = 100;
    private static final String EMPRESA = "Fatec Campinas";
    
    //Atributos de instancia
    private int codigo;
    private String nome;
    private String departamento;
    private float salario;

    public Empregado(String nome){
        this.codigo = proxCod++;
        this.nome = nome;
    }
    
    public int getCodigo(){
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void mostrarEmpregado(){
        System.out.println(EMPRESA + "\n" + 
                this.getCodigo() + " - " + 
                this.getNome() + "(" + 
                this.getDepartamento() + ")\nR$ " +
                this.getSalario() + "\n=============");
    }
    public static void mostrarEmpregado(Empregado e){
        e.mostrarEmpregado();
        
    }
    
    public static void totalEmpregado(){
        System.out.println("Total de empregados: " + (proxCod - 100));
    }
}
