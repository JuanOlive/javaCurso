package javaCurso2024;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// Variaveis fixas de nome de usuario e senha:
		String usuarioCorreto = "admin";
		String senhaCorreta = "123";

		// numero maximo de tentativas:
		int tentativasMaximas = 3;
		int tentativas = 0; // contador de tentativas

		// entradas do usuario:
		Scanner scanner = new Scanner(System.in);

		// tentativa de login 01:
		System.out.println("Digite o nome do usuário: ");
		String usuario = scanner.nextLine();

		System.out.println("Digite a senha: ");
		String senha = scanner.nextLine();

		if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
			System.out.println("login realizado com sucesso! Bem vindo.");
		} else {
			// tentativas = tentativas + 1;
			tentativas++; // mesma coisa que a linha de cima!
			System.out.println("Usuário ou senha incorretos, tente novamente!");

			// tentativas 02
			System.out.println("Digite o nome de usuario: ");
			usuario = scanner.nextLine();

			System.out.println("Digite a senha: ");
			senha = scanner.nextLine();

			if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
				System.out.println("Login realizado com sucesso! Bem-vindo.");
			} else {
				tentativas++;
				System.out.println("Usuário ou senha incorretos, tente novamente!");

				// tentativa final:
				System.out.println("Tentativa final, seu login será bloqueado!");
				System.out.println("Digite o nome de usuario: ");
				usuario = scanner.nextLine();

				System.out.println("Digite a senha: ");
				senha = scanner.nextLine();

				if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
					System.out.println("Login realizado com sucesso! Bme-vindo.");
				} else {
					tentativas++;
					System.out.println("Acesso bloquado após 3 tentativas erradas!");

				}

			}

		}
		// fechar o scanner
		scanner.close();

	}

}
