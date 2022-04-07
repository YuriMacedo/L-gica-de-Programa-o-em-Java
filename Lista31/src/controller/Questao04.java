package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		int numero;
		
		numero = Teclado.lerInt("Digite um número:");
		
		System.out.println("Antecessor:"+(numero-1));
		System.out.println("Sucessor:"+(numero+1));
		

	}

}
