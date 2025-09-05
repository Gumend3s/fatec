import javax.swing.JOptionPane;

public class LinguagemProgamacaol extends Disciplina implements Pratica {
    String laboratorio;

    public LinguagemProgamacaol() {
    
    }

    @Override
    public float calcularMedia(){
        float prova1, prova2, trabalho;
        prova1 = (JOptionPane.showInputDialog());
        float media = ((prova1 * 4.5) + (prova2 * 4.5))+ 1;  
        return media;      
    }
}
