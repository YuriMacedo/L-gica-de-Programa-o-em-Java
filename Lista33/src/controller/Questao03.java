package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		double numer1;
		double numer2;
		double valorComAcres1;
		double valorComDescont2;
		
		numer1 = Teclado.lerDouble("Digite um número: ");
		numer2 = Teclado.lerDouble("Digite o segundo número: ");
		
		valorComAcres1 = (numer1 * 0.3) + numer1;
		valorComDescont2 = numer2 - (numer2 * 0.25);
		
		System.out.println("Primeiro número com 30% de acréscimo: "+valorComAcres1+ " Segundo número com desconto de 25%: "+valorComDescont2);
		
		

	}

}
