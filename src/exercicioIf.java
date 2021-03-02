//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
import java.util.Scanner;

public class exercicioIf {

	public static void main(String[] args) {
		int num;	
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero inteiro");
		num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("O numero digitado e positivo : " + num);
		}
		
		else {
			System.out.println("O numero digitado e negativo: " + num);
		}
		
	}
		
		
		
}


