public class App {
    public static void main(String[] args) throws Exception {

        Banco brasil = new  Banco("Banco do brasil");
        Cliente erik = new Cliente("erik", "11122233344",brasil);




        erik.criar(5000.78, 82565487, brasil);
        erik.criar(505100.78, 82216456,brasil);
        
        
    }
}
