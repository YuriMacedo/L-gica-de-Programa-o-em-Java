package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		//dólar a 3,99,fazer a conversãodo dólar para o real
		double dolar; 
		double real; 
		
		dolar = Teclado.lerDouble("Digite um valor em dólar");
		real = dolar * 3.99;
		
		System.out.println("Valor em reais:R$"+real);
		

	}

}
