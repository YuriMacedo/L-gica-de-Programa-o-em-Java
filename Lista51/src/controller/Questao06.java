package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		int numer;
		int i;
		
		numer = Teclado.lerInt("Digite um n�mero: ");
		
		i = numer;
		
		if (numer <= 50) {
			
			while(i < 250) {
				
				System.out.println(i);
				
				i = i * 3;
				
			}
			
			
		}else {
			
			System.out.println("O n�mero digitado � maior ou igual a 50.");
		}

	}

}
