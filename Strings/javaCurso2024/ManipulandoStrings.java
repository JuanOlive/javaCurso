package javaCurso2024;

public class ManipulandoStrings {
	public static void main(String[] args) {
		// Criando Strings:
		String texto = "Bem Vindo ao Curso Intermediário de Java";
		String texto2 = "Vamos aprender sobre Strings!";

		// 1. Comrprimento da String:
//		System.out.println("Comprimento da string: " + texto.length());
//		
//		//2. Contatenar Strings:
//		String textoCompleto = texto + texto2;
//		//System.out.println("Texto completo :" + textoCompleto);
//		
//		//3. Converter para MAIÚSCULAS E minúsculas:
//		//System.out.println("MAIÚSCULAS: " + texto.toUpperCase());
//		//System.out.println("minusculas: " + texto2.toLowerCase());
//
//		//4. Substituir uma parte da String:
//		String novoTexto = texto.replace("Java", "PHP");
//		//System.out.println("Texto após a substituição: " + novoTexto);
//		
//		//5. Buscar por uma substring:
//		int posicao = texto.indexOf("Curso");
//		System.out.println("Posição da palavra 'Curso': " + posicao);
//		
//		//6. verificar se uma string comeca ou termina com uma substring:
//		System.out.println("Começa com 'Bem': " + texto.startsWith("Bem"));

		// 7. Dividir uma String:
//		String nomeCompleto = "Juan de Oliveira Souza";
//		String[]  palavras = nomeCompleto.split(" ");
//		System.out.println("Palavras no texto completo: ");
//		
//		for (String palavra : palavras ) {
//			System.out.println(palavra);
//		}
//		

		// 8. Remover espaços:
		String textoComEspacos = " Texto           com espaços.              ";
		System.out.println("Texto sem espaços: " + textoComEspacos.trim().replaceAll("\\s+", " "));
	}

}
