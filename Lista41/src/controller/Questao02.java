package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		String capital;
		
		capital = Teclado.lerTexto("Qual � a capital do Brasil? ");
		
		if (capital.equals("Bras�lia")) {
			
			System.out.println("Resposta correta.");
			
		}else{
			
			System.out.println("A capital do Brasil � Bras�lia.");
		}

	}

}
