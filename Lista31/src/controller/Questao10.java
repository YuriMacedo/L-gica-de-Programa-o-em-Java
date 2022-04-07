package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		
		int tempo; 
		double valor;
		double taxa;
		double prestacao;
		
		valor = Teclado.lerDouble("Digite o valor");
		taxa = Teclado.lerDouble("Digite o valor da taxa:");
		tempo = Teclado.lerInt("Digite o tempo:");
		
		
		prestacao = valor+(valor*(taxa/100)*tempo);
		
		System.out.println("O valor de sua prestação esta em:"+prestacao+"R$");
		
		
		
		
		
		
		
		

	}

}
