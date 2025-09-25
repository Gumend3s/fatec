import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ManipulacaoDeListas {

    public static void main(String[] args) {
        String[] cores1 = {"preto", "amarelo", "verde", "azul", "violeta", "prata"};
        String[] cores2 = {"dourado", "branco", "marrom", "azul", "cinza", "prata"};
        List<String> lista1 = new ArrayList<>(Arrays.asList(cores1));
        List<String> lista2 = new ArrayList<>(Arrays.asList(cores2));
        lista1.addAll(lista2);
        lista2.clear();
        System.out.println("--- Lista Concatenada ---");
        imprimirLista(lista1);
        converterMaiusculas(lista1);
        System.out.println("\n--- Lista em Maiúsculas ---");
        imprimirLista(lista1);
        Collections.sort(lista1);
        System.out.println("\n--- Lista Ordenada ---");
        imprimirLista(lista1);
        excluirItensDuplicados(lista1);
        System.out.println("\n--- Lista sem Itens Duplicados ---");
        imprimirLista(lista1);
        System.out.println("\n--- Lista na Ordem Inversa ---");
        imprimirListaReversa(lista1);
    }
    public static void imprimirLista(List<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
    public static void converterMaiusculas(List<String> lista) {
        ListIterator<String> iterator = lista.listIterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            iterator.set(elemento.toUpperCase());
        }
    }
    public static void excluirItensDuplicados(List<String> lista) {
        Set<String> set = new HashSet<>(lista);
        lista.clear();
        lista.addAll(set);
        Collections.sort(lista);
    }
    public static void imprimirListaReversa(List<String> lista) {
        ListIterator<String> iterator = lista.listIterator(lista.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}