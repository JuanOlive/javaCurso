package javaCurso2024;

import java.util.Scanner;

public class DiasMes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um mes e veja quantos dias: ");
		String mes = scan.next();

		switch (mes) {
		case ("janeiro"):
			System.out.println("O mes " + mes + " tem 31 dias");
			break;
		case ("fevereiro"):
			System.out.println("O mes " + mes + " tem 28 (29 em anos bissextos) dias");
		break;
		case ("março"):
			System.out.println("O mes " + mes + " tem 31 dias");
		break;
		case ("abril"):
			System.out.println("O mes " + mes + " tem 30 dias");
		break;
		case ("maio"):
			System.out.println("O mes " + mes + " tem 31 dias");
		break;
		case ("junho"):
			System.out.println("O mes " + mes + " tem 30 dias");
		break;
		case ("julho"):
			System.out.println("O mes " + mes + " tem 31 dias");
		break;
		case ("agosto"):
			System.out.println("O mes " + mes + " tem 31 dias");
		break;
		case ("setembro"):
			System.out.println("O mes " + mes + " tem 30 dias");
		break;
		case ("outubro"):
			System.out.println("O mes " + mes + " tem 31 dias");
		break;
		case ("novembro"):
			System.out.println("O mes " + mes + " tem 30 dias");
		break;
		case ("dezembro"):
			System.out.println("O mes " + mes + " tem 31 dias");
		break;
		default:
			System.out.println("Digite um mes válido");
			break;

		}

	}

}
