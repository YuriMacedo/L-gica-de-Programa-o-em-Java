package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		
		int eleitores;
		int brancos;
		int nulos;
		int validos;
		double nulosPorcent;
		double brancosPorcent;
		double validosPorcent;
		
		
		eleitores = Teclado.lerInt("Digite o número de eleitores:");
		brancos = Teclado.lerInt("Digite o número de votos brancos:");
		nulos = Teclado.lerInt("Digite o número de votos nulos:");
		validos = Teclado.lerInt("Digite o número de votos válidos:");
		
		
		nulosPorcent = 100* nulos / (eleitores);
		brancosPorcent = 100* brancos / (eleitores);
		validosPorcent = 100* validos / (eleitores);
		
		System.out.println("A porcentagem de votos brancos são de: "+brancosPorcent+"%");
		System.out.println("A porcentagem de votos nulos são de: "+nulosPorcent+"%");
		System.out.println("A porcentagem de votos válidos são de: "+validosPorcent+"%");
		
		
		
		

	}

}
