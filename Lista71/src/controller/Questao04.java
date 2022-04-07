package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		int [] n = new int[8];
		
		
		for(int i = 0 ; i < 8 ; i++) {
			
			n[i] = Teclado.lerInt("Digite o número : ");
			
			
			
			
		}//fim do for
		
		int[] nb = new int [8];
		
		
		for (int i = 0 ; i < 8 ; i++) {
			
			nb[i] = n[i] * 3;
			
			System.out.println("Números digitados multiplicados por 3 : "+nb[i]);
		}//fim do for

	}

}
