public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String mesExtenso;

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getMesExtenso() {
        return mesExtenso;
    }

    public int getAno() {
        return ano;
    }

    public Data(int dia, int mes, int ano, String mesExtenso) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.mesExtenso = mesExtenso;
    }

    public int compara(){
        if(dia == this.dia && mes == this.mes && ano == this.ano) {
            return 0;
        }
        else if(dia >= this.dia && mes >= this.mes && ano >= this.ano) {
            return 1;
        }
        else{
            return -1;
        }
    }

    public boolean isBissexto(){
        if(this.ano % 4 == 0)
            return true;
        else
            return false;
    }

    public Data clone(){
        return new Data(this.dia, this.mes, this.ano, mesExtenso);
    }
}
