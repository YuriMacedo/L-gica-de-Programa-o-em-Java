package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		int numer;
		
		numer= Teclado.lerInt("Digite um número positivo ou negativo :");
		
		if (numer > 0 ) {
			
		System.out.println("O número digitado é positivo.");	
			
		}else { 
			if (numer == 0) {
			
			
			System.out.println("O número digitado é nulo.");
			
			}else {
				System.out.println("O número digitado é negativo.");
			}
			
		}

	}

}
