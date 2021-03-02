package Estoque;

import java.util.Scanner;
import Estoque.Produto;


public class MainEstoque {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Digite os dados do produto:");
		System.out.println("Name :");
		
		produto.name = sc.nextLine();
		
		System.out.println("Preco:");
		produto.preco = sc.nextDouble();
		
		System.out.println("Quantidade :");
		produto.quantidade = sc.nextInt();
		
		System.out.println(produto);
		
		sc.close();
	}
}
