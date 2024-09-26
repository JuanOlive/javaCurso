package javaCurso2024;

import java.util.Scanner;

public class DescontoProduto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto: ");
		double preco = scan.nextDouble();
		
		System.out.println("Digite quanto % de desconto voce ganhou: ");
		double desconto = scan.nextInt();
			
		
		double valorFinal = preco - (preco * (desconto/100));
		
		
		
		System.out.println("O valor que você vai ter que pagar com desconto é: R$" + valorFinal);
		
		
	}

}
