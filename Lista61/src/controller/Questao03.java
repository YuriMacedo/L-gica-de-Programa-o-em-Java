package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		int n = Teclado.lerInt("Informe um número : ");
		int resto = n % 2;
		
		
		switch(resto) {
		case 0:
			
		System.out.println("Par");
		break;
		case 1:
			System.out.println("Ímpar");
			break;
			default:
				break;
		
		
		}

	}

}
