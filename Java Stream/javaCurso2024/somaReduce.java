package javaCurso2024;
import java.util.Arrays;
import java.util.List;

public class somaReduce {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6 ,7);
		
		int soma = numeros.stream().reduce(0, (a, b) -> a + b);
		
		System.out.println(soma);
		
	}
	
	
	
	

}

