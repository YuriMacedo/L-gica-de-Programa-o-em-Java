package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		
		int anos;
		int meses;
		int dias;
		int anosResposta;
		
		anos = Teclado.lerInt("Digite sua idade:");
		meses = Teclado.lerInt("Digite o n�mero referente ao m�s em que voc� nasceu:");
		dias = Teclado.lerInt("Digite o dia que voc� nasceu:");
		
		anosResposta = (anos * 365) + (meses * 30) +dias;
		
		System.out.println("J� se passaram: "+anosResposta+" dias desde o dia em que voc� nasceu.");
		
				
		
	}

}
