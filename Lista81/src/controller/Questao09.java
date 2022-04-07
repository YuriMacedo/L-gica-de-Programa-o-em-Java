package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		double[][] a = new double[3][4];
		double[][] b = new double[3][4];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Teclado.lerDouble("["+i+","+j+"]:");
				b[i][j] = Math.pow(a[i][j], 2);
			}
		}
		
		System.out.println("Matriz a:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matriz b:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
