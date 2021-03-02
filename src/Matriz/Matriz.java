package Matriz;

import java.util.Scanner;

//Fazer um programa para ler um numero inteiro N e uma matriz de ordem N de numeros inteiros.
//em seguida mostrar a diagonal principal e a quantidade de valores negativos da matriz
public class Matriz {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		//instanciando a matriz
		int [][] mat = new int [n][n];
		
		for (int i=0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal");
		for (int i=0; i<n; i++) {
			System.out.print(mat[i][i] + "");
		}
		
		sc.close();
	}
}
