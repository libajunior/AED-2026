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
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a média final do aluno");
        double media = scanner.nextDouble();
        
        System.out.println("Informe o percentual de presença");
        double percentualPresenca = scanner.nextDouble();
        
        System.out.println("Resultado Final:");
        
        //Verifico se o aluno está reprovado por falta...
        if (percentualPresenca >= 75) {
            
            //Verifico se está aprovado
            if (media >= 7) {
                System.out.printf("APROVADO com a média %.2f!", media);
            } else {
                if (media >= 5) {
                    System.out.printf("EM EXAME com a média %.2f!", media);
                } else {
                    System.out.println("REPROVADO por nota!");
                }
            }
            
        } else {
            System.out.println("REPROVADO por falta!");
        }
    }
}
