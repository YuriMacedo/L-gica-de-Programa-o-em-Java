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
		
		numer1 = Teclado.lerDouble("Digite o primeiro número: ");
		numer2 = Teclado.lerDouble("Digite o segundo número: ");
		numer3 = Teclado.lerDouble("Digite o terceiro número: ");
		numer4 = Teclado.lerDouble("Digite o quarto número: ");
		
		somasEMultipli = (numer1 * 1) + (numer2 * 2) + (numer3 * 3) + (numer4 * 4);
		mp = somasEMultipli / 10;
		
		System.out.println("A média aritimética ponderada destes números é: "+mp);

	}

}
