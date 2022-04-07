package controller;

import util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
		double e;
		double b;
		double resp;
		double aux;
		
		aux = 1;
		resp = 1;
		
		e = Teclado.lerInt("Digite o valor do expoente: ");
		b = Teclado.lerInt("Digite o valor da base: ");
		
		while(aux <= e) {
			
			resp = resp * b;
			
			aux = aux + 1;
		}System.out.println(b+" elevado à "+e+" = "+resp);

	}

}
