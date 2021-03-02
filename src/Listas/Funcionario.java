package Listas;

public class Funcionario {
	private int id;
	private String name;
	private double salary;
	
	public Funcionario (int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;	
	}
	
	public int getId (int id) {
		return this.id;
	}
	
	public String getName(String name) {
		return this.name;
	}
	
	public double getSalary(double salary) {
		return this.salary;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public void setSalary () {
		this.salary = salary;
	}
	
	public void increaseSalary (double percentage) {
		salary = salary + (salary * percentage / 100.0);
	}
	
	public String toString() {
		return id + "," + name + "," + String.format("%.2f", salary);
	}

	
}
