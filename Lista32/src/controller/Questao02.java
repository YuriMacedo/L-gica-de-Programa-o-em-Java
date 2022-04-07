package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		int horas;
		int minutos;
		int horaResposta;
		
		horas =  Teclado.lerInt("Digite a hora:");
		minutos = Teclado.lerInt("Digite os minutos:");
		
		horaResposta =( horas*60) +minutos;
		
		System.out.println("Já se passaram: "+horaResposta+" minutos desde de 00:00 deste dia.");
		
		
		

	}

}
