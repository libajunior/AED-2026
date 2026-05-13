/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exemplos;

/**
 *
 * @author libajunior
 */

    import java.util.Scanner;

public class Exercicios05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
        String[] periodos = {"Manhã", "Noite"};

        int[][] horas = new int[5][2]; // 5 dias x 2 períodos

        // Leitura dos dados
        for (int dia = 0; dia < 5; dia++) {
            for (int periodo = 0; periodo < 2; periodo++) {
                System.out.printf("Horas estudadas na %s (%s): ", dias[dia], periodos[periodo]);
                horas[dia][periodo] = scanner.nextInt();
            }
        }

        // Exibição da tabela
        System.out.println("\n===== HORAS DE ESTUDO =====");
        System.out.printf("%-12s %-10s %-10s%n", "Dia", "Manhã", "Noite");
        System.out.println("-".repeat(32));

        for (int dia = 0; dia < 5; dia++) {
            System.out.printf("%-12s %-10d %-10d%n",
                dias[dia], horas[dia][0], horas[dia][1]);
        }

        scanner.close();
    }
}
