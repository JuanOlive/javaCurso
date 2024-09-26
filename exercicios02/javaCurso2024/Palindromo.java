package javaCurso2024;

import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva uma palavra para ver se é um palíndromo: ");
		String palavra = scan.next();
		
		String inverso = new StringBuilder(palavra).reverse().toString();
		
		if (palavra.equals(inverso)) {
			System.out.println("A palavra " + palavra + " é um palíndromo!");
		} else {
			System.out.println("A palavra " + palavra + " NÃO é um palíndromo!");
		}
		

	}
}