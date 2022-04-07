package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		int i;
		int base;
		int expo;
		int resp;
		
		i = 1;
		resp = 1;
		base = Teclado.lerInt("Digite a base : ");
		expo = Teclado.lerInt("Digite o expoente : ");
		
		if( expo != 0) {
			
			
		do {
			resp = resp * base;
			
		
			i++;
		}while(i <= expo);
		
		
	}System.out.println(base+" elevado à "+expo+" = "+resp);
	}
}
