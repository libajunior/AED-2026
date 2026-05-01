/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios;

import java.util.Scanner;

/**
 *
 * @author libajunior
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número: "+ (i + 1) +": ");
            numeros[i] = scanner.nextInt();
        }
        
        int countJ = 0;
        
        //Bubble Sort
        for (int i = 0; i < numeros.length; i++) { //Loop 1
            
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                
                countJ++;
                
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
            
        }
        
        //Imprimir a ordem
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] +" ");
        }
        
        
        scanner.close();
    }
}
