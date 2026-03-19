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
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um ano:");
        int y = scanner.nextInt();
        
        int a = y % 19;
        int b = y / 100;
        int c = y % 100;
        int d = b / 4;
        int z = b % 4;


    }
}
