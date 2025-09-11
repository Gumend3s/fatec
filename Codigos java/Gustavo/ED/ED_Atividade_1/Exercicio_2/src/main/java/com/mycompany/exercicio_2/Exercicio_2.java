/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_2;

import java.util.Random;

/**
 *
 * @author gustavo.oliveira262
 */
public class Exercicio_2 {

    public static void main(String[] args) {
        int linhas = 4, colunas = 3, i, j;
        
        int maior = -1, lin = -1, col = -1;
        
        int [][] a = new int [linhas][colunas];
        Random rand = new Random();
        
        for(i = 0; i < linhas; i++) {
            for(j = 0; j < colunas; j++) {
                a[i][j] = rand.nextInt(100)+1;
                System.out.print("|" + String.format(" %3d ", a[i][j]));
            }
            System.out.println("|");
        }
        
        for(i = 0; i < linhas; i++) {
            for(j = 0; j < colunas; j++) {
                if (a[i][j] > maior) {
                    maior = a[i][j];
                    lin = i + 1;
                    col = j + 1;
                }
            }
        }
        
        System.out.println("O maior numero foi: " + maior + ". Esta na coordenada (" + lin + "," + col + ")");
    }
}
