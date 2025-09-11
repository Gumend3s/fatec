/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_1;

import java.util.Random;

/**
 *
 * @author gustavo.oliveira262
 */
public class Exercicio_1 {

    public static void main(String[] args) {
        int linhas = 7, colunas = 5, i, j, soma;
        
        int [][] a = new int [linhas][colunas];
        Random rand = new Random();
        
        for(i = 0; i < linhas; i++) {
            for(j = 0; j < colunas; j++) {
                a[i][j] = rand.nextInt(100)+1;
            }
        }
        
        for(i = 0; i < linhas; i++) {
            soma = 0;
            
            for(j = 0; j < colunas; j++) {
                soma += a[i][j];
                System.out.print("|" + String.format(" %3d ", a[i][j]));
            }
            System.out.println("| Total: " + soma);
        }
    }
}
