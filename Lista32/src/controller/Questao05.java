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
		
		
		numer1 = Teclado.lerDouble("Digite um número:");
		numer2 = Teclado.lerDouble("Digite outro número:");
		
		soma = numer1 + numer2;
		subtracao1 = numer1 - numer2;
		subtracao2 = numer2 - numer1;
		multi = numer1 * numer2;
		divisao = numer1 / numer2;
		restdivisao = numer1 % numer2;
		
		System.out.println("A soma dos números informados são:"+soma);
		System.out.println("A subtração dos números informados são:"+subtracao1+"E mudando a ordem deles a subtração é"+subtracao2);
		System.out.println("A divisão desses números é:"+multi);
		System.out.println("A resposta da divisão desses números é:"+divisao);
		System.out.println("O resto da divisão desses números é:"+restdivisao);
		
		
		
		

	}

}
