package diagrama;

import javax.swing.JOptionPane;

public class LinguagemProgramacao extends Disciplina iplements Pratica{
    
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
    
    @Override
    
    
    @Override
    public float calcularMedia(){
        String entrada;
        float p1, p2;
        
        entrada = JOptionPane.ShowInputDialog();
    }
}
