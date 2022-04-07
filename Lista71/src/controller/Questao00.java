package controller;

import util.Teclado;

public class Questao00 {

	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		
		
		for(int i = 0 ; i < 5 ; i++) {
			
			nomes[i] = Teclado.lerTexto("Informe um nome: ");
			
			
		}//fim do 1º for
		
		for(int i = 0 ; i < 5 ; i++) {
			
			System.out.println(nomes[i]);
			
		}//fim do 2º for

	}

}
