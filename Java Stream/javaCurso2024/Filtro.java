package javaCurso2024;
import java.util.Arrays;
import java.util.List;


public class Filtro {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		//filtrando numeros pares, impares e primos:
		//numeros pares abaixo:
		numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		//Numeros impares abaixo:
		numeros.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

		
		//Numeros primos abaixo:
		numeros.stream().filter(n -> isPrimo(n)).forEach(System.out::println);
	}
	public static boolean isPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}

