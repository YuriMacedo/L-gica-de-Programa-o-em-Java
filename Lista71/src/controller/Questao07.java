package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		
		String [] semana = {"Domingo", " Segunda Feira"," Ter�a Feira", "Quarta Feira","Quinta Feira","Sexta Feira","S�bado"};
		
		int dia;
		dia = Teclado.lerInt("Digite o n�mero :");
		
		switch (dia) {
		case 1:
		System.out.println(semana[0]);
		break;
		case 2:
			System.out.println(semana[1]);
			break;
		case 3:
			System.out.println(semana[2]);
			break;
		case 4:
			System.out.println(semana[3]);
			break;
		case 5:
		System.out.println(semana[4]);
		break;
		case 6:
		System.out.println(semana[5]);
		break;
		case 7:
			System.out.println(semana[6]);
			break;
		default:
			System.out.println("N�mero n�o corresponde a um dia da semana.");
			break;
		
		
		}//fim do switch
		

	}

}
