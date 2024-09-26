package javaCurso2024;

import java.util.Scanner;

public class AtividadesFisicas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Exibe o menu de opções
		System.out.println("Escolha uma atividade fisica");
		System.out.println("1. Corrida ");
		System.out.println("2. Caminhada ");
		System.out.println("3. Ciclismo ");

		// Recebe a escolha do usuário
		int opcao = scan.nextInt();
		int calorias = 0;
		String atividade = "";

		// Estrutura Switch para selecionar atividade e calcular as calorias:

		switch (opcao) {
		case 1:
			atividade = "Corrida";
			calorias = 300;
			break;
		case 2:
			atividade = "Caminhada";
			calorias = 150;
			break;
		case 3:
			atividade = "Ciclismo";
			calorias = 250;
			break;
		default:
			System.out.println("Opção inválida! Tente novamente.");
			System.exit(opcao);

		}
//Exibe o resultado da escolha:
		System.out.println("Você escolheu a ativade: " + atividade);
		System.out.println("Calorias queimadas em 30 min: " + calorias + " kcal");

		// fecha o scanner
		scan.close();
	}

}
