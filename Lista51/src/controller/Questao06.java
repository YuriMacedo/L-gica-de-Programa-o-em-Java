package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		int numer;
		int i;
		
		numer = Teclado.lerInt("Digite um número: ");
		
		i = numer;
		
		if (numer <= 50) {
			
			while(i < 250) {
				
				System.out.println(i);
				
				i = i * 3;
				
			}
			
			
		}else {
			
			System.out.println("O número digitado é maior ou igual a 50.");
		}

	}

}
