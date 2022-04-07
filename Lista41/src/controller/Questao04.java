package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		double numer;
		
		numer = Teclado.lerDouble("Digite um número: ");
		
		if ((numer % 4 == 0 ) &&
				(numer % 5 == 0)) {
			System.out.println("Esse número é divisível por 5 e 4 :"+"número :"+numer);
			
		}else{
			System.out.println("Esse número não é divisível por 5 e 4.");
			
		}
		
		
		
		
		
	}

}
