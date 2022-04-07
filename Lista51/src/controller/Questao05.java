package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		int numer;
		int i;
		
		numer = Teclado.lerInt("Digite um número: ");
		
		i = 1;
		
		while (i <= 10) {
			System.out.println(numer+" . "+i+" = "+(numer * i));
			
			i = i +1;
			
		}

	}

}
