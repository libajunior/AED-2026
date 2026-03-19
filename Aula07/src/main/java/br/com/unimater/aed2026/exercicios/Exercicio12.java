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
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma das opções");
        System.out.println("1. Adição (+)");
        System.out.println("2. Subtração (-)");
        System.out.println("3. Multiplicação (*)");
        System.out.println("4. Divisão (/)");
        int opcao = scanner.nextInt();
        
        System.out.println("Informe o primeiro número");
        double nro1 = scanner.nextDouble();
        
        System.out.println("Informe o segundo número");
        double nro2 = scanner.nextDouble();
        
        double resultado;
        
        switch (opcao) {
            case 1:
                //Adição                
                resultado = nro1 + nro2;
                System.out.printf("O resultado da operação %.2f + %.2f = %.2f",
                        nro1, nro2, resultado);
                break;
            
            case 2:
                //Subtração
                resultado = nro1 - nro2;
                System.out.printf("O resultado da operação %.2f - %.2f = %.2f",
                        nro1, nro2, resultado);
                
                break;
                
            case 3:
                //Multiplicação
                resultado = nro1 * nro2;
                System.out.printf("O resultado da operação %.2f * %.2f = %.2f",
                        nro1, nro2, resultado);
                
                break;  
                
            case 4:
                //Divisão
                if (nro2 != 0) {
                    resultado = nro1 / nro2;    
                    System.out.printf("O resultado da operação %.2f / %.2f = %.2f",
                            nro1, nro2, resultado);
                } else {
                    System.out.println("Erro: Divisão por zero");
                }
                
                break;
                
            default: 
                System.out.println("Opção inválida!");
        }
    }
}
