package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		double valor;
		double gorjeta;
		
		valor = Teclado.lerDouble("Digite o valor:");
		
		gorjeta = valor * 1.1;
		
		System.out.println("O valor a ser pago com os 10% é:"+gorjeta);
				

	}

}
