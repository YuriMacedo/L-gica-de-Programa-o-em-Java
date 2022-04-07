package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		
		int anos;
		int meses;
		int dias;
		int anosResposta;
		
		anos = Teclado.lerInt("Digite sua idade:");
		meses = Teclado.lerInt("Digite o número referente ao mês em que você nasceu:");
		dias = Teclado.lerInt("Digite o dia que você nasceu:");
		
		anosResposta = (anos * 365) + (meses * 30) +dias;
		
		System.out.println("Já se passaram: "+anosResposta+" dias desde o dia em que você nasceu.");
		
				
		
	}

}
