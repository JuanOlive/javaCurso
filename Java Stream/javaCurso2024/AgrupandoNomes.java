package javaCurso2024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupandoNomes {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Juan", "Lorena", "Boby", "Thiago", "Cristiano", "Agno");
		Map<Integer, List<String>> nomesAgrupados = nomes.stream().collect(Collectors.groupingBy(String::length));

		nomesAgrupados.forEach((tamanho, listaNomes) -> {
			System.out.println("Tamanho " + tamanho + ": " + listaNomes);
		});
	}
}
