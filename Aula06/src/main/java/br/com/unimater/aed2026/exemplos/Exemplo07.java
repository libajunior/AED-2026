/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos;

import java.util.Scanner;

/**
 *
 * @author libajunior
 */
public class Exemplo07 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua nota");
        double nota = scanner.nextDouble();
        
        if (nota >= 7) {
            System.out.println("Você está APROVADO!");
        } else {
            System.out.println("Você está REPROVADO!");
        }
        /**
         * TO-DO:
         * 1. Declarar um Scanner;
         * 2. Importar biblioteca Scanner;
         * 3. Solicitar a nota;
         * 4. Armazenar a nota digitada;
         * 5. Criar um condição que verifique se é maior ou igual a 7;
         * 6. Se vaerdadeiro, mostrar mensagem "Você está APROVADO!";
         * 7. Senão, mostrar mensagem "Você está REPROVADO!".
         */
    }
}
