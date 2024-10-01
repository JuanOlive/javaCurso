package javaCurso2024;
import java.util.Scanner;
import java.util.ArrayList;

public class FrutasPrefArrayList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String continuar;
		
		
		ArrayList<String> frutas = new ArrayList<>();
		
		do {
			System.out.println("Digite suas frutas favoritas: ");
			String fruta = scan.next();
			frutas.add(fruta);
			
			
			System.out.println("Deseja botar mais? ");
			continuar = scan.next();
			
		} while (continuar.equalsIgnoreCase("s"));
		
		
		System.out.println("A fruta que voce digitou foi: ");
		for (String fruta : frutas);
		System.out.println(frutas);
		
		
	}

}
