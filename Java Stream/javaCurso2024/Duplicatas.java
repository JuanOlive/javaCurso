package javaCurso2024;

import java.util.Arrays;
import java.util.List;

public class Duplicatas {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7, 8, 8);

		numeros.stream().distinct().forEach(System.out::println);
	}

}
