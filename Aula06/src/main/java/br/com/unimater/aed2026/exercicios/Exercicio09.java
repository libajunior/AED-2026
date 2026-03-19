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
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Portal de Conteúdos ---");
        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Você tem assinatura ativa: (sim/não)");
        String temAssinatura = scanner.nextLine();
        
        System.out.println("Resultado do processamento:");
        
        if (idade >= 18) {
            
            if (temAssinatura.equals("sim")) {
                System.out.println("ACESSO LIBERADO: Conteúdo Premium");
            } else {
                System.out.println("ACESSO LIBERADO: Conteúdo Básico");
            }
            
        } else {
            System.out.println("ACESSO BLOQUEADO. Pirralho!");
        }
    }
}
