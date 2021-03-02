package ExercicioRetangulo;
import ExercicioRetangulo.Retangulo;
import java.util.Scanner;

public class MainRetangulo {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira os dados do retangulo:" + "\n" + "Altura : ");
		retangulo.altura = sc.nextDouble();
		System.out.println("Largura : ");
		retangulo.largura = sc.nextDouble();
		
		System.out.println(retangulo);

		sc.close();
	}
}
