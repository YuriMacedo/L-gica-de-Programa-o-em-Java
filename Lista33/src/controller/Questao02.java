package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		
		double valorHrAula;
		double mesHrTrab;
		double percentualInss;
		double salarioLiquid;
		double salarioBruto;
		double descontoInss;
		
		valorHrAula = Teclado.lerDouble("Digite o valor/aula: ");
		mesHrTrab = Teclado.lerDouble("Digite as horas de trabalho: ");
		percentualInss = Teclado.lerDouble("Digite o percentual de desconto do INSS: ");
		
		salarioBruto = valorHrAula * mesHrTrab;
		descontoInss = salarioBruto * percentualInss / 100;
		salarioLiquid = salarioBruto - descontoInss;
		
		
		System.out.println("Salário líquido: "+salarioLiquid);
		
		  
		
		
		
		
		

	}

}
