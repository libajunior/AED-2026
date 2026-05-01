package br.com.unimater.aed2026.exemplos;

//Soma e Média dos Elementos
public class Exemplo01 {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 77};
        
        int soma  = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            //soma = soma + numeros[i];
            soma += numeros[i];
        }
        
        double media = soma / numeros.length;
        
        System.out.println("Soma: "+ soma);
        System.out.println("Média: "+ media);
    }
}
