package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][2];
		int soma = 0;
		System.out.println(matriz.length);
		System.out.println(matriz[0].length);
		System.out.println(matriz[1].length);
		System.out.println(matriz[2].length);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Teclado.lerInt("["+i+","+j+"]:");
				soma = soma + matriz[i][j];
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Soma: "+soma);
		
		

	}

}
