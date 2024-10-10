package javaCurso2024;

public class Employee {
	protected String name;
	protected double salary;
	
	//Classe Construtora:
	public Employee (String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	//método para calcular o bonus de 10% do salario:
	
	public double calculateBonus() {
		return this.salary * 0.10;  
		
		
		
		
	}
	
	
	//Método para exibir os dados do empregado:
	public void showEmployeeData() {
		System.out.println("Name: " + name);
		System.out.println("Salário: " + salary);
		System.out.println("Bônus: " + calculateBonus());
		System.out.println("Sálario total: " + (salary + calculateBonus()) );
		
		
	}
}
