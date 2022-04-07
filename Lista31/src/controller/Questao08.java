package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		double distancia;
		double consumo;
		double litro;
		
		distancia = Teclado.lerDouble("Informe a distância:");
		consumo = Teclado.lerDouble("Informe o consumo médio do automóvel:");
		
		litro = distancia/consumo;
		System.out.println("Valor do consumo médio séra de:"+litro+" km/l");

	}

}
