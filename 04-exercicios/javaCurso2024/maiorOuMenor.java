package javaCurso2024;
import java.util.Scanner;

public class maiorOuMenor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		if (idade < 18) {
			System.out.println("Voce é de menor filhao");
		} else {
			System.out.println("Voce é de maior! Pode ser preso ja");
		}
	}

}
