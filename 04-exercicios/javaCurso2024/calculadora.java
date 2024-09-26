package javaCurso2024;
import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tipo de conta que deseja fazer: ");
		String conta = scan.next();
		
		System.out.println("Digite o numero: ");
		int numero = scan.next();
		
		System.out.println("Outro numero: ");
		int numero2 = scan.nextInt();
		
		if (conta = "Soma") {
			System.out.println("O resultado é" + numero + numero2);
		}
		
		
		
	}

}
