package diagrama;

public class LinguagemProgramacao extends Disciplina {
    private String laboratorio;

    public LinguagemProgramacao(int codigo, String laboratorio){
        this.laboratorio = laboratorio;
        super(codigo);
    }

    public int getLaboratorio(){
        return laboratorio;
    }

    public void setLaboratorio(int laboratorio){
        this.laboratorio = laboratorio;
    }
}
