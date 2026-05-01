package br.com.unimater.aed2026.exemplos;

// Busca sequencial

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        String[] cidades = {"Curitiba", "Pato Branco", "Francisco Beltrão", "São Lourenço D'Oeste", "Coronel Vivida", "Chopinzinho", "Itú"};
        
        System.out.println("Digite a cidade:");
        String cidade = scanner.nextLine();
        
        boolean encontrou = false;
        
        for (int i = 0; i < cidades.length; i++) {
            if (cidade.toLowerCase().equals(cidades[i].toLowerCase())) {
                encontrou = true;
                break;
            }
        }
        
        if (encontrou) {
            System.out.println("Cidade encontrada!");
        } else {
            System.out.println("Cidade não foi encontrada!");
        }
        
    }
}
