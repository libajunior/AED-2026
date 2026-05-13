package br.com.unimater.aed2026.exemplos;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] frutas = {"Abacaxi", "Banana", "Caqui",
                           "Goiaba", "Laranja", "Maça" };
        
        
        System.out.println("Digitar a fruta a buscar:");
        String busca = scanner.nextLine();
        
        int posicao = -1;
        
        for (int i = 0; i < frutas.length; i++) {
            if (busca.equalsIgnoreCase(frutas[i])) {
                posicao = i;
                break;
            }
        }
        
        if (posicao != -1) {
            System.out.println("Fruta encontrada na posição: "+ 
                    posicao);
        } else {
            System.out.println("Fruta não encontrada!");
        }
        
        scanner.close();
    }
}
