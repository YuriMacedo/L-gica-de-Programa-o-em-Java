package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		double numer1;
		double numer2;
		double numer3;
		double numer4;
		double somasEMultipli;
		double mp;
		
		numer1 = Teclado.lerDouble("Digite o primeiro n�mero: ");
		numer2 = Teclado.lerDouble("Digite o segundo n�mero: ");
		numer3 = Teclado.lerDouble("Digite o terceiro n�mero: ");
		numer4 = Teclado.lerDouble("Digite o quarto n�mero: ");
		
		somasEMultipli = (numer1 * 1) + (numer2 * 2) + (numer3 * 3) + (numer4 * 4);
		mp = somasEMultipli / 10;
		
		System.out.println("A m�dia aritim�tica ponderada destes n�meros �: "+mp);

	}

}
