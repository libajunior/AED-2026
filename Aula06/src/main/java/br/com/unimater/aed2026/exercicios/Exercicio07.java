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
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Sistema de Aprovação de Crédito ---");
        
        //Renda
        System.out.println("Informe a renda do cliente:");
        double renda = scanner.nextDouble();
        
        //Valor Parcela
        System.out.println("Informe o valor da parcela R$:");
        double valorParcela = scanner.nextDouble();
        
        //Idade
        System.out.println("Informe a idade do cliente:");
        int idade = scanner.nextInt();
        
        /***
         * Regras:
         * 1. Parcela < 30% da renda
         * 2. Idade < 30 anos
         */        
        double limiteParcela = renda * 0.3; 
        boolean idadePermitida = !(idade > 30);
        
        if (valorParcela < limiteParcela && idadePermitida) {
            System.out.println(">>> CRÉDITO APROVADO!");
            System.out.printf("A parcela R$ %.2f está dentro do limite de R$ %.2f", 
                    valorParcela, limiteParcela);
        } else {
            System.out.println(">>> CRÉDITO rePROVADO!");
            System.out.println("Motivo: Renda insuficiesnte para a "+
                               "parcela ou idade for da faixapermitida");
        }
    }
}
