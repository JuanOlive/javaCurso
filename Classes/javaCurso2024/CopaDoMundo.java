package javaCurso2024;

import java.util.Scanner;

public class CopaDoMundo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Quantas copas do mundo tivemos! ");
		System.out.println("Digite o ano que estamos:");
		int ano = scan.nextInt();
		int copas = 1930;

		while (copas <= ano) {
			if (copas != 1942 && copas != 1946) {
				System.out.println("Copa do mundo de " + copas + " ");

			}
			copas += 4;
		}

	}

}
