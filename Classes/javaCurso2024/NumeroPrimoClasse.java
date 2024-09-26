package javaCurso2024;

import java.util.Scanner;

public class NumeroPrimoClasse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero e veja se ele é primo: ");
		int numero = scan.nextInt();

		int divisores = 0;

		if (numero <= 1) {
			System.out.println("O numero não é primo");
		} else {
			for (int i = 1; i <= numero; i++) {
				if (numero % i == 0) {
					divisores++;
				}
			}

			if (divisores == 2) {
				System.out.println("O numero é primo");
			} else {
				System.out.println("O numero não é primo");
			}
		}
		

	}

}
