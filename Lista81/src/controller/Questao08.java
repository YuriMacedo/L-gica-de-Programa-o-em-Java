package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		int[][] a = new int[5][3];
		int[][] b = new int[5][3];
		int[][] c = new int[5][3];

		System.out.println("Matriz a:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Teclado.lerInt("["+i+","+j+"]:");
			}
		}
		
		System.out.println("Matriz b:");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = Teclado.lerInt("["+i+","+j+"]:");
				c[i][j] = a[i][j]+b[i][j];				
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\t");
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.print("\t");
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
