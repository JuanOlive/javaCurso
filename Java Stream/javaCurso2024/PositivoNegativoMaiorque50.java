package javaCurso2024;
import java.util.Arrays;
import java.util.List;


public class PositivoNegativoMaiorque50 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,-43,45,2,3,5,6,34,432);
		
		boolean numeroMaior50 = numeros.stream().anyMatch(n -> n > 50);
		System.out.println("Numero maior que 50: " + numeroMaior50);
		
		boolean todoPositivos = numeros.stream().allMatch(n -> n > 0);
		System.out.println("todos positivos?:" + todoPositivos);
		
		boolean nenhumNegativo = numeros.stream().noneMatch(n -> n < 0);
		System.out.println("nenhum é negativo? " + nenhumNegativo);
		
		
	}

}
