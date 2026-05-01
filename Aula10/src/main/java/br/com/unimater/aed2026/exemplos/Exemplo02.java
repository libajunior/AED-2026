package br.com.unimater.aed2026.exemplos;

// Contagem com Condição
public class Exemplo02 {
    public static void main(String[] args) {
        double[] notas = {8.0, 6.5, 9.0, 5.0, 7.7};
        int aprovados = 0;
        
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7.0) {
                aprovados++;
            }
        }
        
        System.out.println("Aprovados: "+ aprovados);
    }
}
