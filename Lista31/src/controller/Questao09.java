package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		double numero1;
		double quadrado;
		double raiz;
		
		numero1 = Teclado.lerDouble("Informe um n�mero:");
		
		quadrado = Math.pow(numero1, 2);
		raiz = Math.sqrt(numero1);
		
				
				
				System.out.println("O n�mero informado �:");
				System.out.println("Quadrado "+quadrado);
				System.out.println("Raiz quadrada:"+raiz);
				
		
		 
		
		
		
		

	}

}
