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
		
		
		eleitores = Teclado.lerInt("Digite o n�mero de eleitores:");
		brancos = Teclado.lerInt("Digite o n�mero de votos brancos:");
		nulos = Teclado.lerInt("Digite o n�mero de votos nulos:");
		validos = Teclado.lerInt("Digite o n�mero de votos v�lidos:");
		
		
		nulosPorcent = 100* nulos / (eleitores);
		brancosPorcent = 100* brancos / (eleitores);
		validosPorcent = 100* validos / (eleitores);
		
		System.out.println("A porcentagem de votos brancos s�o de: "+brancosPorcent+"%");
		System.out.println("A porcentagem de votos nulos s�o de: "+nulosPorcent+"%");
		System.out.println("A porcentagem de votos v�lidos s�o de: "+validosPorcent+"%");
		
		
		
		

	}

}
