package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		int valor1;
		int valor2;
		int valor3;
		int valor4;
		int soma;
		int mult;
		
		valor1 = Teclado.lerInt("Digite o valor 1");
		valor2 = Teclado.lerInt("Digite o valor 2");
		valor3 = Teclado.lerInt("Digite o valor 3");
		valor4 = Teclado.lerInt("Digite o valor 4");
		
		
		soma = valor1+valor2+valor3+valor4;
		mult = valor1*valor2*valor3*valor4;
		
		System.out.println("Soma: "+soma);
		System.out.println("Multiplicação:"+mult);
				
				
		
	}

}
