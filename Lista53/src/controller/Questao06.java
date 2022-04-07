package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		int n = Teclado.lerInt("Digite a base : ");
		int ex = Teclado.lerInt("Digite o expoente : ");
		int pot = 1;
		
		for(int i = 1; i <= ex ; i++) {
			
			pot = pot * n;						
			
				
			
		}System.out.println(pot);

	}

}
