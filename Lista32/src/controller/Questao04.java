package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		double peso;
		double altura;
		double imc;
		
		peso = Teclado.lerDouble("Digite seu peso:");
		altura = Teclado.lerDouble("Digite seu altura:");
		
		imc = peso / Math.pow(altura, 2);
		
		System.out.println("Seu IMC é:"+imc);

	}

}
