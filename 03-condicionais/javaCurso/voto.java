package javaCurso;

import java.util.Scanner;

public class voto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		int idade = scan.nextInt();
		
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR FILHÃO");
		} else if ((idade >= 16 && idade < 18) || idade > 65) {
			System.out.println("Voto facultativo");
			
		} else if (idade >= 18 && idade < 65) {
			System.out.println("VAI VOTAR FILHÃO É OBRIGATÓRIO, SE NAO OS CARA DA MULTA DE 3,50 CONTO");
		}
	}

}


public class suite {
	public static void main()
}
