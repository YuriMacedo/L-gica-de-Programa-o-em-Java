package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		int numer;
		
		numer = Teclado.lerInt("Digite um n�mero inteiro qualquer :");
		
		if ((numer >= 1) && (numer <= 10)){
			
			System.out.println("O n�mero digitado esta entre 1 e 10.");
		}else {
			System.out.println("O n�mero digitado n�o esta entre 1 e 10.");
		}

	}

}
