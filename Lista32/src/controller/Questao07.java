package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		double valor;
		double prestacao;
		double valorFinal;
		
		valor = Teclado.lerDouble("Digite o valor do produto:");
		prestacao = Teclado.lerDouble("Digite em quantas vezes voc� ir� querer pagar o produto:");
		
		
		valorFinal = valor/ prestacao;
		
		System.out.println("Sua presta��o ir� ficar em:"+valorFinal+" por m�s.");
		
		

	}

}
