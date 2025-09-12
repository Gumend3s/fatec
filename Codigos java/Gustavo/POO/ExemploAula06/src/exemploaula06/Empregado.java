/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploaula06;

/**
 *
 * @author gustavo.oliveira262
 */
public class Empregado {
    // atributos de classe
    private static int proxCod = 100;
    private static final String EMPRESA = "Fatec Campinas";
    
    // atributos da instancia
    private int codigo;
    private String nome;
    private String departamento;
    private float salario;
    
    public Empregado(String nome) {
        this.codigo = ++this.proxCod;
        this.nome = nome;
    }
    
    public int getCodigo() {
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
    
    // Função dentro da Instância, chamada pelo objeto
    public void mostrarEmpregado() {
        System.out.println(EMPRESA + "\n" +
                this.getCodigo() + " - " +
                this.getNome() + "(" +
                this.getDepartamento() + ")\nR$ " +
                this.getSalario());
    }
    
    // Função estática, chamada pela classe Empregado em si
    public static void mostrarEmpregado(Empregado e) {
        e.mostrarEmpregado();
    }
    
    public static void totalEmpregados() {
        System.out.println("Total de empregados: " + (proxCod - 100));
    }
}
