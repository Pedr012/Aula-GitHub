package exercicioProduto;

import java.util.Scanner;

public class MainProduto {
	 public static void main (String args []) {
		 Scanner sc = new Scanner (System.in);
		 int n = sc.nextInt();
		 Produto [] vect = new Produto[n];
		 
		 for (int i=0; i < n; i++) {
			 sc.nextLine();
			 String name = sc.nextLine();
			 double price = sc.nextDouble();
			 vect[i] = new Produto(name,price);
		 }
		 
		 double sum = 0;
		 for (int i=0; i<n; i++) {
			 sum += vect[i].getPrice(sum);
		 }
		 
		 double avg = sum /n;
		 System.out.println("A soma dos produtos foi :" + avg);
		 
		 
		 
	 }
}
