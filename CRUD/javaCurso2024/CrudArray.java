package javaCurso2024;

import java.util.Scanner;

public class CrudArray {
	// arrays para armazenar nome e idade:
	static String[] nomes = new String[10];
	static int[] idades = new int[10];
	static int contador = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\n--- Menu ---");
			System.out.println("1. adicionar usuário");
			System.out.println("2. exibir usuários");
			System.out.println("3. atualizar usuário");
			System.out.println("4. deletar usuário");
			System.out.println("5. sair");
			System.out.println("Escolha uma opção: ");
			opcao = scan.nextInt();
			scan.nextLine();
			
			switch(opcao) {
				case 1:
					adicionarUsuario(scan);
					break;
				case 2:
					exibirUsuarios();
					break;
				case 3:
					atualizarUsuario(scan);
					break;
				case 4:
					deletarUsuario(scan);
					break;
				case 5:
					System.out.println("Saindo....");
					break;
					default:
						System.out.println("Opção inválida!");
			}
		} 
		while (opcao != 5 );
			scan.close();
			
	}

	// Criar(Adicionar usuario):
	public static void adicionarUsuario(Scanner scan) {
		if (contador < nomes.length) {
			System.out.println("Digite o nome: ");
			String nome = scan.nextLine();
			System.out.println("Digite a idade: ");
			int idade = scan.nextInt();
			nomes[contador] = nome;
			idades[contador] = idade;
			contador++;
			System.out.println("Usuário cadastrado com sucesso!");
		} else {
			System.out.println("Limite de dados atigindo!");
		}
	}

	// ler /exibir usuários cadastrados:
	public static void exibirUsuarios() {
		if (contador == 0) {
			System.out.println("Nenhum usuário cadastrado!");
		} else {
			for (int i = 0; i < contador; i++) {
				System.out.println((i + 1) + ". Nome: " + nomes[i] + ", idade: " + idades[i]);
			}
		}
	}

	// Atualizar usuários:
	public static void atualizarUsuario(Scanner scan) {
	    System.out.println("Digite o número do usuário a ser atualizado: ");
	    int index = scan.nextInt() - 1;
	    scan.nextLine();  // Consumir a linha restante após o nextInt()

	    if (index >= 0 && index < contador) {
	        // Pedindo novo nome e guardando na variável:
	        System.out.println("Digite o novo nome: ");
	        String nome = scan.nextLine();

	        // Pedindo nova idade e guardando a variável:
	        System.out.println("Digite a nova idade: ");
	        int idade = scan.nextInt();
	        scan.nextLine();  // Consumir a linha restante após o nextInt()

	        // Adicionando itens nos seus respectivos arrays:
	        nomes[index] = nome;
	        idades[index] = idade;
	        System.out.println("Usuário atualizado com sucesso!");
	    } else {
	        System.out.println("Usuário não encontrado!");
	    }
	    
	}


	// Deletar usuário:
	public static void deletarUsuario(Scanner scan) {
		System.out.println("Digite o número do usuário a ser deletado");
		int index = scan.nextInt() - 1;

		if (index >= 0 && index < contador) {
			for (int i = index; i < contador - 1; i++) {
				nomes[i] = nomes[i + 1];
				idades[i] = idades[i + 1];

			}
			nomes[contador - 1] = null;
			idades[contador - 1] = 0;
			contador--;
			System.out.println("Usuário deletado com sucesso!");

		} else {
			System.out.println("Usuário não encontrado!");

		}
	}
}
