package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		double custoprodut;
		double taxa;
		double valordeVenda;
		
		custoprodut = Teclado.lerDouble("Digite o custo do produto:");
		taxa = Teclado.lerDouble("Digite o valor da taxa:");
		
		valordeVenda = custoprodut * (1+taxa/100);
		
		
		System.out.println("O valor final deste produto é:"+valordeVenda+"R$");
		
		

	}

}
