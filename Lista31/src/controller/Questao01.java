package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
	//criar variável que solicite um nome 
		String nome;
		String sexo;
		
		
		nome = Teclado.lerTexto("Digite seu nome:");
		sexo = Teclado.lerTexto("Qual seu sexo?");
		//esse System.out.println é a parte para fazer com que as informaçãoes apareçam na tela
		//Obs:o Sinal de + esta contatenando com as 2 outras strings
		System.out.println("Seu nome é "+nome+".");
		System.out.println("Seu sexo é "+sexo+".");

	}

}
