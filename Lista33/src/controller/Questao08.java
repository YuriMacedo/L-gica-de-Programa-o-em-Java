package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		
		double base;
		double perimetro;
		double area;
		double diagonal;
		double altura;
		
		altura = Teclado.lerInt("Digite a altura do retângulo :");
		base = Teclado.lerDouble("Digite a base do retângulo :");
		
		area = base * altura;
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		perimetro = base + base + altura + altura;
		
		System.out.println("O valor do perímetro deste retângulo é de :"+perimetro);
		System.out.println("O valor da diagonal é de :"+diagonal);
		System.out.println("O valor da área é de :"+area);
		
		
		
		
		
		
		
		
		
		

	}

}
