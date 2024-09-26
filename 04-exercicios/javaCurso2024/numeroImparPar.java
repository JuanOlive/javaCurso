package javaCurso2024;
import java.util.Scanner;


public class numeroImparPar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O numero " + numero + " é par");
		} else {
			System.out.println("O numero " + numero + " é impar");
		}
	}

}
