package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		
		double base;
		double perimetro;
		double area;
		double diagonal;
		double altura;
		
		altura = Teclado.lerInt("Digite a altura do ret�ngulo :");
		base = Teclado.lerDouble("Digite a base do ret�ngulo :");
		
		area = base * altura;
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		perimetro = base + base + altura + altura;
		
		System.out.println("O valor do per�metro deste ret�ngulo � de :"+perimetro);
		System.out.println("O valor da diagonal � de :"+diagonal);
		System.out.println("O valor da �rea � de :"+area);
		
		
		
		
		
		
		
		
		
		

	}

}
