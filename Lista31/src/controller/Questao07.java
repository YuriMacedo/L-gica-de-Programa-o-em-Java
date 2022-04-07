package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		double numero1;
		double numero2;
		double numero3;
		double media;
		
		numero1 = Teclado.lerDouble("Digite um número:");
		numero2 = Teclado.lerDouble("Digite outro número:");
		numero3 = Teclado.lerDouble("Digite outro número:");
		
		media = (numero1+numero2+numero3)/3;
				
		
		System.out.println("Média aritimética é:"+media);
		
		
		
		
		

	}

}
