public class App {
    public static void main(String[] args) throws Exception {
    
    }
}

abstract class pessoa {
    String nome;
    String data_nasci;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getidade() {
        

        return data_nasci;
    }
    public void setData_nasci(int dia,int mes,int ano) {
        this.data_nasci = ""+dia+""+mes+""+ano;
    }
}
