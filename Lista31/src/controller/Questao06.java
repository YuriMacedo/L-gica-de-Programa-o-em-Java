package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		
		double f;
		double c;
		f = Teclado.lerDouble("Digite a temperatura em Fahrenheint:");
		
		// c = (f – 32) x 5 : 9 
		c = (f-32)*5/9;
		
		System.out.println("Temperatura em Celsius:"+c);
	}

}
