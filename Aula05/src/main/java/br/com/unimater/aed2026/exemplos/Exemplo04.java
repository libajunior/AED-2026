/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos;

import java.util.Scanner;

/**
 *
 * @author libajunior
 */
public class Exemplo04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro nro inteiro:");
        int nro1 = scanner.nextInt();
        
        System.out.println("Informe o segundo nro inteiro:");
        int nro2 = scanner.nextInt();
        
        //Adição
        int adicao = nro1 + nro2;
        
        //Subtração
        int subtracao = nro1 - nro2;
        
        //Multiplicação
        int multiplicacao = nro1 * nro2;
        
        //Divisão
        int divisao = nro1 / nro2;
        
        //Resto da Divisão
        int resto = nro1 % nro2;
        
        //Saídas:
        System.out.println("Resultados das Operações:");
        System.out.println("Adição: "+ adicao);
        System.out.println("Subtração: "+ subtracao);
        System.out.println("Multiplicação: "+ multiplicacao);
        System.out.println("Divisão: "+ divisao);
        System.out.println("Resto: "+ resto);   
    }
}
