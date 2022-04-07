package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		int n = Teclado.lerInt("Digite um número : ");
		int fator = 1;
		
		
		for(int i = 1 ; i <= n ; i++) {
			
			fator = fator * i;
			
			
		}System.out.println(n+"! = "+fator);

	}

}
