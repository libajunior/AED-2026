package br.com.unimater.aed2026.exemplos;

import java.util.Scanner;

/**
 *
 * @author libajunior
 */
public class Exercicio01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", 
                         "Quinta", "Sexta", "Sábado"};
        double[] totais = new double[7];
        
        //Entrada de Dados        
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("Digite o total de gasto de %s:", dias[i]);
            totais[i] = scanner.nextDouble();
        }
        System.out.println();
        
        double soma = 0;
        
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("Gastos em %s: R$ %.2f \n", dias[i], totais[i]);
            soma += totais[i];
        }
        System.out.printf("Total Gasto na Semana: R$ %.2f", soma);
        
        scanner.close();
    }
    
}