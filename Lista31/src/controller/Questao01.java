package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
	//criar vari�vel que solicite um nome 
		String nome;
		String sexo;
		
		
		nome = Teclado.lerTexto("Digite seu nome:");
		sexo = Teclado.lerTexto("Qual seu sexo?");
		//esse System.out.println � a parte para fazer com que as informa��oes apare�am na tela
		//Obs:o Sinal de + esta contatenando com as 2 outras strings
		System.out.println("Seu nome � "+nome+".");
		System.out.println("Seu sexo � "+sexo+".");

	}

}
