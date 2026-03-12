/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos;

import java.util.Scanner;

/**
 *
 * @author libajunior
 */
public class Exemplo06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();
        
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é de menor");
        }
           
        /**
         * TO-DO:
         * 1. Declarar um Scanner;
         * 2. Importar biblioteca Scanner;
         * 3. Solicitar a idade;
         * 4. Armazenar a idade digitada;
         * 5. Criar um condição que verifique se é maior de idade;
         * 6. Se maior de idade, mostrar mensagem "Você é maior de idade";
         * 7. Senão, mostrar mensagem "Você é de menor".
         */
    }
}
