package javaCurso2024;

public class Exerc2 {
	public static void main(String[] args) {
		if(args.length > 0) {
			
			int soma = 0;
			
			
			
			for (int i = 0; i < args.length; i++) {
				soma += Integer.parseInt(args[i]);
			}
			
			double media = (double) soma / args.length;
			
			System.out.printf("A média das idades é: ", media);
		} else {
			System.out.println("Entre com valores válidos pra idade.");
		}
	}

}
