package controller;

import util.Teclado;

public class Questao01v2 {

	public static void main(String[] args) {
		String []nome = new String [5];
		String[] profissao = new String[5];
		
		
		for(int i = 0 ; i < 5 ; i++) {
			nome[i] = Teclado.lerTexto("Nome "+i+":");
			profissao[i] = Teclado.lerTexto("Profiss�o "+i+":");
			
			
			
			
		}//fim do for
		System.out.println("\n\nRelat�rio:\n");
		
		for(int i = 0 ; i < 5 ; i++) {
			
			System.out.println("Nome: "+nome[i]+"  - Profiss�o : "+profissao[i]);
			
		}

	}

}
