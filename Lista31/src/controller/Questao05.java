package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		double salario ;
		double salarioFinal;
		
		
		salario = Teclado.lerDouble("Informe seu salário:");
		
		salarioFinal = salario *1.15;
		
		System.out.println("Salário final:"+salarioFinal);

	}

}
