package javaCurso2024;

import java.util.Scanner;

public class PalavraInversa {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma palavra para inverte-la: ");
		String palavra = scan.next();
		
		String inverso = new StringBuilder(palavra).reverse().toString();
		
		System.out.println("A palavra inversa fica : " + inverso);
		
	}

}
