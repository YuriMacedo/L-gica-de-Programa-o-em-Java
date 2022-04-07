package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		double cateto1;
		double cateto2;
		double hipotesoma;
		double hipotenusa;
		
		cateto1 = Teclado.lerDouble("Digite o valor do  primeiro cateto: ");
		cateto2 = Teclado.lerDouble("Digite o valor do segundo cateto: ");
		
		
		hipotesoma = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
		hipotenusa = Math.sqrt(hipotesoma);
		
		System.out.println("O valor da hipotenusa é "+hipotenusa);
		
		
		
		
		
		
		

	}

}
