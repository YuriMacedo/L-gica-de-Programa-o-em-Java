package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		double salario ;
		double salarioFinal;
		
		
		salario = Teclado.lerDouble("Informe seu sal�rio:");
		
		salarioFinal = salario *1.15;
		
		System.out.println("Sal�rio final:"+salarioFinal);

	}

}
