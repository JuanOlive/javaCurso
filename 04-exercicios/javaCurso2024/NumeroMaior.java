package javaCurso2024;
import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		System.out.println("Digite outro numero");
		int numero2 = scan.nextInt();
		
		if (numero > numero2) {
			System.out.println("O numero maior é: " + numero);
		} else if (numero < numero2) {
			System.out.println("O numero maior é: " + numero2);
		}

		// TODO Stub de método gerado automaticamente

	}

}
