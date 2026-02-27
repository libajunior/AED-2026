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
public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome da Empresa:");
        String nomeEmpresa = scanner.nextLine();

        System.out.println("Informe o nome do Atendente:");
        String nomeAtendente = scanner.nextLine();

        System.out.println("Bem-vindo ao atendimento da empresa " + nomeEmpresa);
        System.out.println("Meu nome é " + nomeAtendente + ", sou seu atendente virtual.");

        System.out.println("Informe o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Obrigado "+ nomeCliente +", como posso ajudar?");
    }

}
