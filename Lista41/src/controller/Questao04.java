package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		double numer;
		
		numer = Teclado.lerDouble("Digite um n�mero: ");
		
		if ((numer % 4 == 0 ) &&
				(numer % 5 == 0)) {
			System.out.println("Esse n�mero � divis�vel por 5 e 4 :"+"n�mero :"+numer);
			
		}else{
			System.out.println("Esse n�mero n�o � divis�vel por 5 e 4.");
			
		}
		
		
		
		
		
	}

}
