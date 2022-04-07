package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		
		int [] n = new int[5];
		int soma = 0;
		
		
		for(int i = 0 ; i < 5 ; i++) {
			
			n[i] = Teclado.lerInt("Digite o número : ");
			
			soma = soma + n[i];
			
			
			
			
		}//fim do for
		System.out.println("A soma dos números digitados : "+soma);

	}

}
