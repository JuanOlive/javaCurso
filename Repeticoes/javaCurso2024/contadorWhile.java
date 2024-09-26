package javaCurso2024;
import java.util.Scanner;

public class contadorWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero que deseja iniciar o contador: ");
		int contador = scan.nextInt();
		
		System.out.println("Digite o numero que deseja parar o contador: ");
		int contador2 = scan.nextInt();
		
		while (contador <= contador2) {
			if (contador % 7 == 0) {
				continue;
			}
			System.out.print(contador + " ,");
			contador+=4;
		
		
		}		
}}