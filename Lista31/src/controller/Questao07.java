package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		double numero1;
		double numero2;
		double numero3;
		double media;
		
		numero1 = Teclado.lerDouble("Digite um n�mero:");
		numero2 = Teclado.lerDouble("Digite outro n�mero:");
		numero3 = Teclado.lerDouble("Digite outro n�mero:");
		
		media = (numero1+numero2+numero3)/3;
				
		
		System.out.println("M�dia aritim�tica �:"+media);
		
		
		
		
		

	}

}
