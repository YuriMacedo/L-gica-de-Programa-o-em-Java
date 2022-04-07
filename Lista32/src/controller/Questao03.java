package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		double peso;
		double  altura;
		double alturaCm;
		double pesog;
		
		peso = Teclado.lerDouble("Digite se peso:"+"Kg");
		altura= Teclado.lerDouble("Digite sua altura:");
		
		pesog = peso * 1000;
		alturaCm = altura * 100;
		System.out.println("Seu peso em gramas é:"+pesog);
		System.out.println("Sua altura em centímetros é:"+alturaCm);
		
		
		

	}

}
