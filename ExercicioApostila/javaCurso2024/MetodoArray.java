package javaCurso2024;

public class MetodoArray {
	public static int maiorNumero(int[] numeros) {
		
		int maior = Integer.MIN_VALUE;
		
		for (int num : numeros) {
			if (num > maior) {
				maior = num;
				
			}
		}
		return maior;
	}
	
	public static void main(String[] args) {
		int[] numeros = {-10, -23, -65, -75};
		System.out.println("O numero maior é: " + maiorNumero(numeros));
	}

}
