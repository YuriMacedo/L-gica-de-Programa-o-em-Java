package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		int i;
		int n;
		int aux;
		
		i = 1;
		n = Teclado.lerInt("Digite um n�mero : ");
		
		do {
			 aux = n * i;
			
			System.out.println(n+" x "+i+" = "+aux);
			
			i++;
		}while(i <= 10);

	}

}
