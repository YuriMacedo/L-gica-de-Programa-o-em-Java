package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		int i;
		int v1;
		int v2;
		int v3;
		
		i = 1;
		v1 = Teclado.lerInt("Digite um número : ");
		v2 = Teclado.lerInt("Digite osegundo número : ");
		
		
		do {
			v3 = v1 + v2;
			v1 = v2;
			v2 = v3;
			System.out.println("O 15º será "+v1);
			
			i++;
		}while(i <= 15);
		
		

	}//fim do while

}
