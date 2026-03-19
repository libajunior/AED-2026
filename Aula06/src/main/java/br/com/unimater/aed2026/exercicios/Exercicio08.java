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
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Cálculo de IMC ---");
        System.out.println("Digite o seu peso (KG):");
        double peso = scanner.nextDouble();
        
        System.out.println("Digite a sua altura e M (1,75)");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.printf("Seu IMC é %.2f \n\n", imc);
        System.out.print("CLASSIFICAÇÃO: ");
        
        if (imc < 18.5) {
            System.out.print("Abaixo do Peso");
        } else if (imc < 25) {
            System.out.print("Peso normal");
        } else if (imc < 30) {
            System.out.print("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
