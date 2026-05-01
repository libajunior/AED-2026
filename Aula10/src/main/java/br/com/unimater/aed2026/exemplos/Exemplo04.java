/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exemplos;

/**
 *
 * @author libajunior
 */
public class Exemplo04 {
    public static void main(String[] args) {
        int[] idades = {18, 19, 25, 48, 29, 12, 10};
        int maior = 0;
        
        for (int i = 0; i < idades.length; i++) {
            if (maior < idades[i]) {
                maior = idades[i];
            }
        }
        
        System.out.println("Maior: "+ maior);
    }
}
