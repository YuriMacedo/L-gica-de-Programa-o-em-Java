package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		int numer1;
		int numer2;
		
		numer1 = Teclado.lerInt("Digite um n�mero :");
		numer2 = Teclado.lerInt("Digite outro n�mero :");
		
		if(numer1 % numer2 == 0) {
			
			System.out.println("O 2� n�mero � divisor do primeiro.");
		}else {
			System.out.println("O 2� n�mero n�o � divisor do primeiro.");
		}

	}

}
