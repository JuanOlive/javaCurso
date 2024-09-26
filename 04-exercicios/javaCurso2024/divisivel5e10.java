package javaCurso2024;
import java.util.Scanner;

public class divisivel5e10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero para ver se é divisivel por 3 ou por 5: ");
		int numero = scan.nextInt();
		
		if (numero % 3 == 0 && numero % 5 == 0 ) {
			System.out.println("O numero é divisivel por 5 e por 3");
		} else {
			System.out.println("O numero não é divisivel por 5 e por 3");
		}
	}

}
