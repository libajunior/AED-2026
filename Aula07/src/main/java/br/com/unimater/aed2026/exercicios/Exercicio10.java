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
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a medida do lado A");
        double ladoA = scanner.nextDouble();
        
        System.out.println("Informe a medida do lado B");
        double ladoB = scanner.nextDouble();
        
        System.out.println("Informe a medida do lado C");
        double ladoC = scanner.nextDouble();
        
        //Teste de Condiçõa de Existência
        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            
            //É um triângulo....
            
            //Testar se é equilátero
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triângulo EQUILÁTERO");
            } else {
                //Testar se é isoceles
                if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                    System.out.println("Triângulo ISOCELES");
                } else {                    
                    System.out.println("Triângulo ESCALENO");
                }
            }
            
        } else {
            System.out.println("ERRO: As medidas não formam um triângulo");
        }
    }
}
