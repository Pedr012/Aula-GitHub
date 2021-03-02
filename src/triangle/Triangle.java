package triangle;

public class Triangle {
	public double a, b, c, p ;
	
	public double area() {
		p = (a + b + c) / 2.0;
		return Math.sqrt(p* (p-a) * (p-b) * (p-c));
		
		
	}
}
