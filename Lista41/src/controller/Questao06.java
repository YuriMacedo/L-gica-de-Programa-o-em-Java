package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		int numer1;
		int numer2;
		
		
		numer1 = Teclado.lerInt("Digite um número :");
		numer2 = Teclado.lerInt("Digite outro número :");
		
		
		
		if (numer1 > numer2) {
			System.out.println("O primeiro menos o segundo :"+(numer1 - numer2));
		}else{
			System.out.println("O segundo menos o primeiro :"+(numer2 - numer1));
			
		}

	}

}
