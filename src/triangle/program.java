package triangle;

import java.util.Scanner;

public class program {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		double p, areaX, areaY;
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
		
		System.out.println("Enter the measures of triangle X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		System.out.println("Triangle X area: " + areaX + "\n Triangle Y area : " + areaY );
		
		if (areaX > areaY) {
			System.out.println("Area X is greater");
		}
		else {
			System.out.println("Area Y is greater");
		}
	
		
		sc.close();
	}
}
