package javaCurso2024;

public class Carro1 implements Veiculo1 {
	//Construtor sem parametros(necessário para a linha 'new carro')
	public Carro1() {
		//se ouver lógica de inicialização, insira-a aqui!
		
		
		
		
	}
	
	@Override
	public void acelerar() {
		System.out.println("O carro está acelerando...");
	}

	
	@Override
	public void frear() {
		System.out.println("O carro está freando...");
	}
	@Override
	public void acabouGasosa() {
		System.out.println("O combustivel esta acabando!!");
	}
		

	@Override
	public void pneuFurou() {
		// TODO Stub de método gerado automaticamente
		
	}
	
}
