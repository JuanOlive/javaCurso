package javaCurso2024;

import java.util.Scanner;

public class JurosCompostos {
	public static void main(String[] args) {
		// Instanciando o scanner para usá-lo;
		Scanner scan = new Scanner(System.in);

		// Pegar dados do usuário

		// capital
		System.out.println("Digite o capital: ");
		double capital = scan.nextDouble();

		// taxa de juros
		System.out.println("Digite a taxa de juros anual: ");
		double taxa = scan.nextDouble();

		// pegar o tempo da aplicação:
		System.out.println("Digite o tempo: ");
		int tempo = scan.nextInt();

		// Cálculo dos juros compostos (anual):
		double montante = capital * Math.pow(1 + (taxa / 100), tempo);
		double juros = montante - capital;

		// resultados:
		System.out.println("O valor do juros compostos é: " + juros);
		System.out.println("O valor total (principal + juros) é: " + montante);

		scan.close();

	}

}
