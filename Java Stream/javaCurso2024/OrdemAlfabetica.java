package javaCurso2024;

import java.util.Arrays;
import java.util.List;

public class OrdemAlfabetica {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Juan", "Lorena", "Thiago", "Hyago", "Doralice");
		
		nomes.stream().sorted().forEach(System.out::println);
	}
}