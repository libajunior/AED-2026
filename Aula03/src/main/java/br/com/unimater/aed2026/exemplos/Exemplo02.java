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
public class Exemplo02 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá, seja bem vindo a central de atendimento UniTelecom");
        System.out.println("Digite o seu nome:");
        
        String nomeCliente = scanner.nextLine();
        
        System.out.printf("Olá %s, seja bem vindo!", nomeCliente);
    }

}
