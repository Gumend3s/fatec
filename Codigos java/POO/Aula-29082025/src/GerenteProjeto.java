import java.time.LocalDate;
import java.util.List;

public class GerenteProjeto extends Funcionario{
    List<Desenvolvedor> desen;
    List<Designer> desig;
    int nomeProjeto;
    LocalDate Prazo;
    
    public GerenteProjeto(String nome, int cpf, float salario, LocalDate datadeadmissao, List<Desenvolvedor> desen,
            List<Designer> desig, int nomeProjeto, LocalDate prazo) {
        super(nome, cpf, salario, datadeadmissao);
        this.desen = desen;
        this.desig = desig;
        this.nomeProjeto = nomeProjeto;
        Prazo = prazo;
    }



    public List<Desenvolvedor> getDesen() {
        return desen;
    }

    public void setDesen(List<Desenvolvedor> desen) {
        this.desen = desen;
    }

    public List<Designer> getDesig() {
        return desig;
    }

    public void setDesig(List<Designer> desig) {
        this.desig = desig;
    }

    public float calcularSalario(float projetoValor,float descontosCLT,float salarioFixo){
        float salario;

        salario = projetoValor + salarioFixo - descontosCLT;

        return salario;
    }
    
    public int getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(int nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public LocalDate getPrazo() {
        return Prazo;
    }

    public void setPrazo(LocalDate prazo) {
        Prazo = prazo;
    }

}
