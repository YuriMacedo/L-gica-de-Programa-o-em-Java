package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		int soma = 0;
		int n = Teclado.lerInt("Digite um número : ");
		
		for(int i = 1; i <= n ; i++) {
			
			soma = soma + i;
			System.out.println(soma);
			
			
			
		}
		

	}

}
