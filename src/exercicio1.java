import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	double largura;
	double comprimento;
	int areaTerreno;
	
	largura = sc.nextDouble();
	comprimento = sc.nextDouble();
	
	areaTerreno = (int) (largura * comprimento);
	System.out.println("Esta é a largura do terreno : " + largura + "\n Esse e o comprimento do terreno : " + comprimento + "\n Essa e a area do terreno: " + areaTerreno);
			sc.close();
	}

}
