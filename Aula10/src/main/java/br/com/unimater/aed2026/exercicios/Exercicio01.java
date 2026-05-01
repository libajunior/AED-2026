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
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int contPar = 0;
        int contImpar = 0;
        
        //Primeiro: Leio os valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o "+ (i + 1) +"o número: ");
            numeros[i] = scanner.nextInt();
        }
        
        //Testar se são pares ou ímpares
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        
        //Mostrar o resultado:
        System.out.println("Qtdade de pares: "+ contPar);
        System.out.println("Qtdade de ímpares: "+ contImpar);
        
        scanner.close();
    }
    
}
