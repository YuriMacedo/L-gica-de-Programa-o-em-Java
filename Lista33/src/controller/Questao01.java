package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		double raio;
		double areaDoCirculo;
		
		
		raio = Teclado.lerDouble("Digite o valor do raio: ");
		
		areaDoCirculo = 3.14159265 * (Math.pow(raio, 2) );
		
		System.out.println("A área do círculo é: "+areaDoCirculo);
		
		
	}

}
