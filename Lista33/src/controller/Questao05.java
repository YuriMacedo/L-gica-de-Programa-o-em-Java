package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		double altura;
		double raio;
		double volume;
		
		altura = Teclado.lerDouble("Digite a altura: ");
		raio = Teclado.lerDouble("Digite o raio ");
		
		volume = Math.PI * Math.pow(raio, 2) * altura;
		
		System.out.println("O volume desta lata é de: "+volume);
		
	 
		

	}

}
