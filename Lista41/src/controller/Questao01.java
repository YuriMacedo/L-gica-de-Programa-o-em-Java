package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		double numer1;
		
		
		
		
		numer1 = Teclado.lerDouble("Digite um n�mero :");
		
		
		if (numer1 >= 20) {
		
		System.out.println("O n�mero digitado foi :" +numer1/2);
		
		}else{
			System.out.println("O n�mero digitado ultrapassou o valor de 20 :"+numer1);
		}
		
		
		

	}

}
