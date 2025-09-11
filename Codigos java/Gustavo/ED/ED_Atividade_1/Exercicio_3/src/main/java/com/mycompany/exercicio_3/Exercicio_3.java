/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author gustavo.oliveira262
 */
public class Exercicio_3 {

    public static void main(String[] args) {
        
        String [] cores1 = {"preto", "amarelo", "verde", "azul", "violeta", "prata"};
        String [] cores2 = {"dourado", "branco", "marrom", "azul", "cinza", "prata"};

        List<String> lista1 = new ArrayList<>(Arrays.asList(cores1));
        List<String> lista2 = new ArrayList<>(Arrays.asList(cores2));

        lista1.addAll(lista2);

        lista2.clear();

        imprimirLista(lista1);

        converterMaiusculas(lista1);

        System.out.println("\n======== Mauiusculas ========");
        imprimirLista(lista1);

        Collections.sort(lista1);

        System.out.println("\n====== Ordem Alfabetica =====");
        imprimirLista(lista1);

        excluirItensDuplicados(lista1);

        System.out.println("\n===== Exclusao Repetidos ====");
        imprimirLista(lista1);

        System.out.println("\n======= Lista Reversa =======");
        imprimirListaReversa(lista1);
    }
    
    public static void  imprimirLista(List<String> lista){
        for (String item : lista) {
            System.out.println(item);
        }
    }
    
    public static  void  converterMaiusculas(List lista1){
        for (int i = 0; i < lista1.size(); i++) {
            String item = lista1.get(i).toString();
            if (item != null){
                lista1.set(i,item.toUpperCase());
            }
        }
    }

    public static void excluirItensDuplicados(List lista){
        Set<String> excluiD = new LinkedHashSet<>(lista);
        lista.clear();
        lista.addAll(excluiD);
    }

    public static  void imprimirListaReversa(List lista){
        List<String> copiaReversa = new ArrayList<>(lista);
        Collections.reverse(copiaReversa);
        imprimirLista(copiaReversa);
    }
}
