package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		int[][] matriz = new int[5][3];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = Teclado.lerInt("Informe um número:");
			}
		}
		
		System.out.println("Dados da matriz:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
}


