package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		int numer1;
		int numer2;
		
		numer1 = Teclado.lerInt("Digite um número :");
		numer2 = Teclado.lerInt("Digite outro número :");
		
		if(numer1 % numer2 == 0) {
			
			System.out.println("O 2° número é divisor do primeiro.");
		}else {
			System.out.println("O 2º número não é divisor do primeiro.");
		}

	}

}
