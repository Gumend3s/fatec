import java.time.LocalDate;
import java.time.Period;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        Professor abrao = new Professor("Abrao", LocalDate.of(2001,8,14), "ADS", null);
        Aluno luiz = new Aluno("Luiz",LocalDate.of(1999, 8, 23),"ADS",8,abrao); 

        System.out.println(luiz.getNome());
        System.out.println(luiz.getidade());
        System.out.println(luiz.getTurma());

    }
}

abstract class Pessoa {
    private String nome;
    private LocalDate data_nasci;
    
    public Pessoa(String nome, LocalDate data_nasci) {
        this.nome = nome;
        this.data_nasci = data_nasci;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getidade() {
        int idade = Period.between(data_nasci,LocalDate.now()).getYears();
        return idade;
    }
    public void setData_nasci(int dia,int mes,int ano) {
        this.data_nasci =  LocalDate.of(ano,mes,dia);
    }
}

class Aluno extends Pessoa{

    private String turma;
    private int notas;
    private Professor professor;

    public Aluno(String nome, LocalDate data_nasci, String turma, int notas, Professor professor) {
        super(nome, data_nasci);
        this.turma = turma;
        this.notas = notas;
        this.professor = professor;
    }

    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public int getNotas() {
        return notas;
    }
    public void setNotas(int notas) {
        this.notas = notas;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
};

class Professor extends Pessoa {

    private String turma;
    private List<Aluno> alunos;


    
    public Professor(String nome, LocalDate data_nasci, String turma, List<Aluno> alunos) {
        super(nome, data_nasci);
        this.turma = turma;
        this.alunos = alunos;
    }
    
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

};