package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		double numer1;
		double numer2;
		double soma;
		double subtracao1;
		double subtracao2;
		double multi;
		double divisao;
		double restdivisao;
		
		
		numer1 = Teclado.lerDouble("Digite um n�mero:");
		numer2 = Teclado.lerDouble("Digite outro n�mero:");
		
		soma = numer1 + numer2;
		subtracao1 = numer1 - numer2;
		subtracao2 = numer2 - numer1;
		multi = numer1 * numer2;
		divisao = numer1 / numer2;
		restdivisao = numer1 % numer2;
		
		System.out.println("A soma dos n�meros informados s�o:"+soma);
		System.out.println("A subtra��o dos n�meros informados s�o:"+subtracao1+"E mudando a ordem deles a subtra��o �"+subtracao2);
		System.out.println("A divis�o desses n�meros �:"+multi);
		System.out.println("A resposta da divis�o desses n�meros �:"+divisao);
		System.out.println("O resto da divis�o desses n�meros �:"+restdivisao);
		
		
		
		

	}

}
