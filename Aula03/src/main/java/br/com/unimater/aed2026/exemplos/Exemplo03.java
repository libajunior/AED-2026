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
//        System.out.println("Olá, bem vindo a central de atendimento UniTelecom");
//        System.out.println("Meu nome é Libório Júnior, sou seu assistente virtual");
//        System.out.println("Durante o atendimento siga minhas instruções:");
//        System.out.println("Primeiramente informe seu nome");
//        System.out.println("Obrigado Pedro, como posso lhe ajudar?");

        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Olá, bem vindo a central de atendimento UniTelecom");
        System.out.println("Meu nome é Libório Júnior, sou seu assistente virtual");
        System.out.println("Durante o atendimento siga minhas instruções:");
        System.out.println("Primeiramente informe seu nome");
        
        String nomeCliente = meuScanner.nextLine();
        
        System.out.printf("Obrigado %s, como posso lhe ajudar?", nomeCliente);
    }
}
