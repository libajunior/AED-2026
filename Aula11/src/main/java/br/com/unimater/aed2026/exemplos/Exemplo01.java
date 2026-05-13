/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos;

/**
 *
 * @author libajunior
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int[][] numeros = {
            { 10, 20, 30 },
            { 40, 50, 60 },
            { 70, 80, 90 }
        };
        
        int soma = 0;
        
        
        for (int lin = 0; lin < numeros.length; lin++) {        //linhas
            for (int col = 0; col < numeros[0].length; col++) { //colunas
                soma += numeros[lin][col];
            }
        }
        
        double media = soma / (numeros.length * numeros[0].length);
                
        System.out.println("Soma: "+ soma);
        System.out.println("Média: "+ media);
    }
}
