package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
	  
		int [] n = new int [5];
		int soma = 0;
		
		
		for(int i = 0 ; i < 5 ; i++) {
			
			n[i] = Teclado.lerInt("Digite o número : ");
			
			if(n[i] % 2 == 1) {
				
				soma = soma + n[i];
				
				
				
			}//fim do if			
			
			
		}//fim do for
		
		System.out.println("A soma dos números ímpares : "+soma);
		

	}

}
