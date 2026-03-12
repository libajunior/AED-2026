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
public class Exemplo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean restricao = false;
        
        System.out.println("Informe a renda do Cliente");
        double renda = scanner.nextDouble();
        
        System.out.println("Informe o score do Cliente");
        int score = scanner.nextInt();
        
        if (score >= 700 && renda >= 2500 && !restricao) {
            System.out.println("Crédito Aprovado");
        } else {
            System.out.println("Crédito Reprovado");
        }
        
         
        /***
         * TO-DO: Análise de Crédito
         * 1. Declarar Scanner e importar
         * 2. Ler a renda do cliente e armazenar
         * 3. Ler o score do cliente e armazenar
         * 4. Se score >= 700 E renda >= 2500, Então, 
         * 5. Mostrar mensagem de Crédito Aprovado
         */
    }
}
