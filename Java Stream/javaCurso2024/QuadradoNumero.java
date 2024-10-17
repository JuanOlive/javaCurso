package javaCurso2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class QuadradoNumero {
	public static void main(String[] args) {
		List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> quadrados = numero.stream().map(n -> n * n).collect(Collectors.toList());
		
		System.out.println(quadrados);
	}

}
