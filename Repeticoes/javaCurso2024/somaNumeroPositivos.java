package javaCurso2024;

import java.util.Scanner;

public class somaNumeroPositivos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;

		while (true) {
			System.out.println("Escreva numeros para somar todos, digite um negativo quando quiser parar: ");
			int numero = scan.nextInt();
			
			
			if (numero < 0) {
				System.out.println("A soma dos numeros é: " + numero + soma);
				break;
			}
		}

	}

}
