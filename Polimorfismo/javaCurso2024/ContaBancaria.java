package javaCurso2024;

public class ContaBancaria {

	// Criando atributo privado:
	private double saldo;

	// Criando método construtor para inicializar o saldo:
	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	// Método publico para depositar dinheiro na conta:
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor; // saldo = saldo + valor;
			System.out.println("Depósito de R$ " + valor + " realizado");
		} else {
			System.out.println("Valor de depósito inválido!");
		}

	}
	//Método para sacar dinheiro da conta
	public void sacar (double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado");
			
		} else if (valor > saldo) {
			System.out.println("Saldo insuficiente");
		}else {
			System.out.println("Numero de saque inválido");
		}
	}
	//Método publico para consulatar o saldo (getter):
	public double getSaldo() {
		return saldo;
	}

}
