package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		int numer;
		
		numer= Teclado.lerInt("Digite um n�mero positivo ou negativo :");
		
		if (numer > 0 ) {
			
		System.out.println("O n�mero digitado � positivo.");	
			
		}else { 
			if (numer == 0) {
			
			
			System.out.println("O n�mero digitado � nulo.");
			
			}else {
				System.out.println("O n�mero digitado � negativo.");
			}
			
		}

	}

}
