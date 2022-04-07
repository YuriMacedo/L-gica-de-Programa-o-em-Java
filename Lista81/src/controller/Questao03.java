package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		int[][] matriz = new  int[4][3];
		int soma = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Teclado.lerInt("["+i+","+j+"]:");
				if(matriz[i][j]%2==0) {
					soma = soma + matriz[i][j];
				}
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Soma dos números pares: "+soma);

	}

}
