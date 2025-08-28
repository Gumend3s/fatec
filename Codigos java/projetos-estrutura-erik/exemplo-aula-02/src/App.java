import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Produto carrinho = new Produto("Carrinho", "Brinquedo", "Hot Wheels", "07894582170045");
        Cliente Erik = new Cliente("Erik Yan", LocalDate.of(1999,05,23), "111.111.222-33", "5555 8888 7777 9999", carrinho);
    }
}
