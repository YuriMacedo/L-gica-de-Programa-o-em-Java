package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		int numer;
		
		numer = Teclado.lerInt("Digite um n�mero :");
		
		if (numer >= 0) {
			
			System.out.println("M�dulo de valor :"+numer);
		}else {
			System.out.println("M�dulo de valor :"+(numer * -1));
		}
		

	}

}
