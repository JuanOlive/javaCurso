package javaCurso2024;

import java.util.Scanner;


public class MaiorNumero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite outro numero: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Digite o ultimo: ");
		int numero3 = scan.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O numero " + numero1 + " é o maior.");
			
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O numero " + numero2 + " é o maior.");
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("O numero " + numero3 + " é o maior.");
		} else {
			System.out.println("Os numeros sao inválidos ou iguais.");
		}
	}

}
