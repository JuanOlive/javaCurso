package javaCurso2024;

import java.util.Scanner;

public class OperaConta {
	public static void main(String[] args) {
		// Criação de uma conta bancaria com saldo inicial de R$ 1000,00:
		ContaBancaria conta = new ContaBancaria(1000.00);
		Scanner scan = new Scanner(System.in);
		
		
		// Operando a conta do cliente:
		// Exibir o saldo inicial da conta:
		System.out.println("Saldo inicial: " + conta.getSaldo());
		System.out.println("Digite o quanto deseja depositar: ");
		double deposito = scan.nextDouble();
		

		conta.depositar(deposito);

		System.out.println("Saldo após depósito: " + conta.getSaldo());
		System.out.println("Digite o quanto deseja sacar: ");
		double saque = scan.nextDouble();
		

		conta.sacar(saque);

		System.out.println("Saldo final: " + conta.getSaldo());

	}

}
