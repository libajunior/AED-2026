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
public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        double soma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digita a nota "+ (i + 1) +": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        
        
        double mediaTurma = (soma / notas.length);
        int notasAcimaMedia = 0;
        
        
        for (int i = 0; i < 10; i++) {
            if (notas[i] > mediaTurma) {
                notasAcimaMedia++;
            }
        }
        
        System.out.printf("Média da Turma: %.2f \n", mediaTurma);
        System.out.println("Notas Acimada Média da Turma: "+ notasAcimaMedia);
        
        scanner.close();
    }
    
}
