package controller;

import util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
		int numer;
		
		numer = Teclado.lerInt("Digite um número com 3 casas :");
		
		if ((numer >= 100)  && (numer < 1000)){
			
			System.out.println("O número da casa centisimal é :"+(numer / 100));
			
		}else {
			
			System.out.println("O número digitado possui mais/menos do que três casas.");
		}

	}

}
