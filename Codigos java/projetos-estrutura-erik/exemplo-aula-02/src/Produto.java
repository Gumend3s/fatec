public class Produto {
    private String Nome;
    private String Tipo;
    private String Fabricante;
    private String CodigoBarras;
    
    public Produto(String nome, String tipo, String fabricante, String codigoBarras) {
        Nome = nome;
        Tipo = tipo;
        Fabricante = fabricante;
        CodigoBarras = codigoBarras;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public String getFabricante() {
        return Fabricante;
    }
    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }
    public String getCodigoBarras() {
        return CodigoBarras;
    }
    public void setCodigoBarras(String codigoBarras) {
        CodigoBarras = codigoBarras;
    }
}
