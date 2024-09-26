package javaCurso2024;

import java.util.Scanner;

public class VogaisContagem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva uma frase e veja quantas vogais tem: ");
		String frase = scan.next();
		
		int vogais = 0;
		
		
		for (int number = 0; number < frase.length(); number++ ) {
			char letra = frase.charAt(number);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra =='u') {
				vogais++;
				
			}
		}
		
		System.out.println("A frase contém: " + vogais + " vogais.");
		

	}
}