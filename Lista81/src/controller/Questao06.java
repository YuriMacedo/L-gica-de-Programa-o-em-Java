package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		double[][] matriz = new double[3][5];
		double soma = 0;
		
		for (int i = 0; i < 3; i++) {
			soma = 0;
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = Teclado.lerDouble("["+i+","+j+"]:");
				soma = soma + matriz[i][j];				
			}
			matriz[i][4] = soma/4;			
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
