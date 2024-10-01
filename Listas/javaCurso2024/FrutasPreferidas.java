package javaCurso2024;

import java.util.Scanner;

public class FrutasPreferidas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] frutas = new String[15];
	
		
		for (int item = 0; item < frutas.length; item++) {
			System.out.println("Digite suas frutas favoritas: ");
			frutas[item] = scan.nextLine();
		}
		System.out.println("As frutas que voce digitou sao: ");
		for (String fruta : frutas) {
			System.out.println(fruta);
			
		}
		
		
		
		
		
	}

}
