package controller;

import util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
		int numer;
		
		numer = Teclado.lerInt("Digite um n�mero com 3 casas :");
		
		if ((numer >= 100)  && (numer < 1000)){
			
			System.out.println("O n�mero da casa centisimal � :"+(numer / 100));
			
		}else {
			
			System.out.println("O n�mero digitado possui mais/menos do que tr�s casas.");
		}

	}

}
