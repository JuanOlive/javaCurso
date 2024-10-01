package javaCurso2024;

public class ArraySimples {

	public static void main(String[] args) {
		// Criando um array(lista) de frutas:
		//Array comeca com ZERO nas principais linguagens!
		String[] frutas = { "Banana", "Maçã", "Pera", "Tomate", "Melancia", };
		//Exibindo apenas um item do array:
		//System.out.println("Minha fruta é: " + frutas[0]);
		
		//Exibir todos os itens do array com for:
		//item < frutas.length: deve ser lido como: enquanto o valor da variavel item for menor que o comprimento do array frutas, incrementar a variavel item usando item++
		for (int item = 0; item < frutas.length; item++) {
			System.out.println(frutas[item]);
		}

	}

}
