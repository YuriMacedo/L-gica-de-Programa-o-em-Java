package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		double distancia;
		double consumo;
		double litro;
		
		distancia = Teclado.lerDouble("Informe a dist�ncia:");
		consumo = Teclado.lerDouble("Informe o consumo m�dio do autom�vel:");
		
		litro = distancia/consumo;
		System.out.println("Valor do consumo m�dio s�ra de:"+litro+" km/l");

	}

}
