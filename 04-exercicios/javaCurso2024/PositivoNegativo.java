package javaCurso2024;
import java.util.Scanner;

public class PositivoNegativo {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		if (numero < 0) {
			System.out.println("O numero é negativo");
		} else if (numero > 0) {
			System.out.println("O numero é positivo");
		} else {
			System.out.println("O numero é zero");
		}
	}

}
