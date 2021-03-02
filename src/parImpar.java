//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
import java.util.Scanner;

public class parImpar {
	public static void main (String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero e irei te dizer se o numero e par ou impar");
		num = sc.nextInt();
		
		sc.close();
		
		if (num % 2 == 0) {
			System.out.println("O numero e par");
		}
		
		else {
			System.out.println("O numero e impar");
		}
		
		
	}
		
}
	

