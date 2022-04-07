package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		int[][] a = new int[3][5];
		int[] b = new int[5];
		int soma = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Teclado.lerInt("["+i+","+j+"]:");
			}
		}
		
		for (int j = 0; j < a[0].length; j++) {
			soma = 0;
			for (int i = 0; i < a.length; i++) {
				soma = soma + a[i][j];
			}
			b[j] = soma;
		}
		
		System.out.println("Matriz a:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Vetor b:");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+"\t");
		}
		

	}

}
