package Listas;
import Listas.Funcionario;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MainFuncionario {
	public static void main (String args []) {
		int xF;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionarios serao registrados ?");
		xF = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();
		
		for (int i=0; i<xF; i++) {
			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.println("Id:");
			int id = sc.nextInt();
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary:");
			double salary = sc.nextDouble();
		
			Funcionario func = new Funcionario(id, name, salary);
			list.add(func);
		}
		
		System.out.println("Digite o id do funcionario que recebera aumento:");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if (pos == null) {
			System.out.println("Este id nao existe, tente outro diferente");
		}
		else {
			System.out.println("Entre com a porcentagem:");
				double percent = sc.nextDouble();
				list.get(pos).increaseSalary(percent);
		}
		
		System.out.println("Lista de funcionarios");
		for (Funcionario func : list) {
			System.out.println(func);
		}
		
	}
	
	public static Integer position (List<Funcionario> list, int id) {
		for (int i=0; i < list.size(); i++) {
			if (list.get(i).getId(i) == id) {
			return i;
		}
		return null;
		
	}
		return id;
}
}
