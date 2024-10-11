package javaCurso2024;
import java.util.Scanner;

public class ExecutarPagamento{
	public static void main(String[] args) {
		Pagamento pagarCartap = new CartaoDeCredito();
		Pagamento pagarBoleto = new Boleto();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("-----Pagamento de conta-----");
		System.out.println("Digite a forma que voce deseja pagar: (Boleto ou Cartao)");
		String forma = scan.next();
		
		
		if (forma.equalsIgnoreCase("boleto")) {
			pagarBoleto.realizarPagamento();
		} else if (forma.equalsIgnoreCase("cartao")) {
			pagarCartap.realizarPagamento();
		} else {
			System.out.println("Digite uma forma válida!");
		}
		
		
		
	}
	
	
	
	

}
