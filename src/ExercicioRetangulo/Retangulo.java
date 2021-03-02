package ExercicioRetangulo;

public class Retangulo {
	public double altura, largura, area, diagonal, perimetro;
	
	public double areaRetangulo() {
		return altura * largura;
	}
	
	public double calcularPerimetro() {
		return perimetro = 2 *(altura + largura);
	}
	
	public double calcularDiagonal() {
		 double p;
		 p = (altura * altura) + (largura * largura);
		 return Math.sqrt(p);
	}
	
	public String toString () {
		return "Esses sao os valores obtidos ; " + "\n" + "Altura : " + altura + "\n" + "Largura : " + 
				largura + "\n" + "Area do Retangulo: " + areaRetangulo() + "\n" + "Perimetro do Retangulo : " + calcularPerimetro() + 
				"\n" + "Diagonal do Retangulo : " + calcularDiagonal() ;
		
	}
	

}
