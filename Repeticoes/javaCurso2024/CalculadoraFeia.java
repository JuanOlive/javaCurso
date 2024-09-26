package javaCurso2024;

import java.util.Scanner;

public class CalculadoraFeia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Bem-vindo á calculadora feia");
		System.out.println("Digite um numero: ");
		double numero = scan.nextInt();

		System.out.println("Digite o outro numero: ");
		double numero2 = scan.nextInt();

		System.out.println("Digite uma operação: +, -, *, /");
		String operacao = scan.next();

		double resultado;
		switch (operacao) {
		case "+":
			resultado = numero + numero2;
			System.out.println("O resultado deu: " + resultado);
			break;
		case "-":
		resultado = numero - numero2;
		System.out.println("O resultado deu: " + resultado);
		break;
		case "*":
			resultado = numero * numero2;
			System.out.println("O resultado deu: " + resultado);
			break;
		case "/":
			resultado = numero / numero2;
			System.out.println("O resultado deu: " + resultado);
			break;
			default:
				System.out.println("Digite uma operação válida: ");
		}
	}

}
