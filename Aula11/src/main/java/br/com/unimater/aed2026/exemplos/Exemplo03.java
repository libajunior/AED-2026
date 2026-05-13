/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exemplos;

import java.util.Scanner;

/**
 *
 * @author libajunior
 */
public class Exemplo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Alunos (lin) x Disciplina (col)
        double[][] notas = new double[4][3]; 
        
        for (int lin = 0; lin < notas.length; lin++) {
            System.out.println("\n=== Aluno "+ (lin+1) +" === ");
            
            for (int col = 0; col < notas[0].length; col++) {
                System.out.print("Informe Notas Disciplina "+ (col+1) +": ");
                notas[lin][col] = scanner.nextDouble();
            }
        } 
        
        
        for (int lin = 0; lin < notas.length; lin++) {
            
            double soma = 0;
            
            for (int col = 0; col < notas[0].length; col++) {
                soma += notas[lin][col];
            }
            
            double media = soma / notas[lin].length;
            System.out.printf("A média do Aluno %d foi %.2f \n", (lin+1), media);
            
        }
        
        scanner.close();
    }
}
