package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		int n = Teclado.lerInt("Digite um valor : ");
		
		for(int i = 0 ; i <= 10 ; i++) {
			
			
			System.out.println(n+" x "+i+" = "+n * i);
			
		}
	}

}
