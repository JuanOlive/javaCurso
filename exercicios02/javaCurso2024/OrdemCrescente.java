package javaCurso2024;

import java.util.Scanner;
import java.util.Arrays;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o tamanho do vetor ao usuário
        System.out.print("Digite a quantidade de números que você deseja armazenar: ");
        int tamanho = scanner.nextInt();
        
        // Cria um vetor com o tamanho especificado pelo usuário
        int[] numeros = new int[tamanho];
        
        // Solicita os números ao usuário
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt(); // Armazena o número digitado
        }
        
        // Ordena o vetor em ordem crescente
        Arrays.sort(numeros);
        
        // Exibe os números em ordem crescente
        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero); // Exibe cada número ordenado
        }
        
        scanner.close();  // Fecha o scanner para evitar vazamento de recursos
    }
}
