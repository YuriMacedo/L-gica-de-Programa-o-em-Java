package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		double numer1;
		
		numer1 = Teclado.lerDouble("Digite um número: ");
		
		if (numer1 % 2 == 1 ) {
			System.out.println("Esse número é ímpar."); 
		}else{
			System.out.println("Esse número é par.");
		}
		
		

	}

}
