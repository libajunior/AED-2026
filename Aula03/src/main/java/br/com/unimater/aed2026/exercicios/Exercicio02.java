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
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seja bem vindo ao jogo, informe seu primeiro nome:");
        String nomeJogador = scanner.nextLine();
        
        System.out.println("Informe seu sobrenome:");
        String sobrenomeJogador = scanner.nextLine();
        
        System.out.println("Jogador "+ nomeJogador +" "+ 
                sobrenomeJogador +" entrando no jogo...");
    }
}
