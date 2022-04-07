package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		double[][] matriz = new double[5][2];
		double soma = 0;
		double media;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Teclado.lerDouble("Informe ["+i+","+j+"]: ");
				soma = soma + matriz[i][j];
			}
		}
		media = soma/(matriz.length*matriz[0].length);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Média: "+media);
		
		

	}

}
