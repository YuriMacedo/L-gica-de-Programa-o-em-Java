package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		
		double termo1;
		double razao;
		double termo5;
		
		
		termo1 = Teclado.lerDouble("Digite o primeiro termo :");
		razao = Teclado.lerDouble("Digite a razão :");
		
		
		termo5 = termo1 * Math.pow(razao, 5-1);
		
		System.out.println("O quinto termo da P.G é :"+termo5);
		
		
		
		

	}

}
