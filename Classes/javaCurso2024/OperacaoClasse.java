package javaCurso2024;

public class OperacaoClasse {
	
	public int Soma(int a, int b) {
		return (a + b);
	}
	
	public int Subtracao(int a, int b) {
		return (a - b);
	}
	public int multiplicacao(int a, int b) {
		return (a * b);
	}
	public double divisao(int a, int b) {
		return (a / b);
	}
public static void main(String[] args) {
	OperacaoClasse util = new OperacaoClasse();
	
	
	System.out.println("A soma de 10 e 23 é: " + util.Soma(10, 23));
	System.out.println("A subtração 10 e 23 é: " + util.Subtracao(10, 23));
	System.out.println("A multiplicação de 10 e 23 é: " + util.multiplicacao(10, 23));
	System.out.println("A divisao de 10 e 23 é: " + util.divisao(10, 23));
	
}
}
