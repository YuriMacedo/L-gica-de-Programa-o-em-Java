package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		double termo1;
		double razao;
		double termo10;
		
		
		razao = Teclado.lerDouble("Digite a raz�o :");
		termo1 = Teclado.lerDouble("Digite oprimeiro termo :");
		
		termo10 = termo1 + (razao *(10-1));
		
		System.out.println("O d�cimo termo dessa P.A � de: "+termo10);
		
		
		
		
		

	}

}
