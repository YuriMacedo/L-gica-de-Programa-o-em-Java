package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		//d�lar a 3,99,fazer a convers�odo d�lar para o real
		double dolar; 
		double real; 
		
		dolar = Teclado.lerDouble("Digite um valor em d�lar");
		real = dolar * 3.99;
		
		System.out.println("Valor em reais:R$"+real);
		

	}

}
