
import java.util.Scanner;

public class minutosTelefone {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int minutos, conta, valorFinal;
		
		minutos = sc.nextInt();
		
		if (minutos > 100) {
			conta = minutos - 100;
			conta = conta * 2;
			valorFinal = conta + 50;
			
			System.out.println("Os seus minutos excederam o limite, portanto o valor da conta foi alterado de R$50 para : R$" + valorFinal);
			
		}
		else {
			System.out.println ("Os seus minutos nao excederam o limite, entao o valor a ser pago sera R$50.00");
		}
		
		sc.close();
	}
}
