package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		
		System.out.println(" ___________________________________________");
		System.out.println("|Código|"+" Planeta |"+" Gravidade Relativa |");
		System.out.println("|  1   |"+" Mercúrio|"+"        0,37        |");
		System.out.println("|  2   |"+" Vênus   |"+"        0,88        |");
		System.out.println("|  3   |"+" Marte   |"+"        0,38        |");
		System.out.println("|  4   |"+" Júpiter |"+"        2,64        |");
		System.out.println("|  5   |"+" Saturno |"+"        1,15        |");
		System.out.println("|  6   |"+" Urano   |"+"        1,17        |");
		System.out.println("|______|____________|_______________________|");
		
		
		
		int codigo = Teclado.lerInt("Digite o código.");
		double pesoTerra = Teclado.lerInt("Digite o seu peso.");
		double pesoPlaneta = 0;
		
		switch(codigo) {
		case 1:
			
			pesoPlaneta = (pesoTerra / 10) * 0.37;
			
			System.out.println("Seu peso em Mercúrio é : "+pesoPlaneta);
			break;
		case 2:
			pesoPlaneta = (pesoTerra / 10) * 0.88;
			System.out.println("Seu peso em Vênus é :"+pesoPlaneta);
			break;
		case 3:
			pesoPlaneta = (pesoTerra / 10) * 0.38;
			System.out.println("Seu peso em Marte é : "+pesoPlaneta);
			break;
		case 4:
			pesoPlaneta = (pesoTerra / 10) * 2.64;
			System.out.println("Seu peso em Júpiter é :"+pesoPlaneta);
			break;
		case 5:
			pesoPlaneta = (pesoTerra / 10) * 1.15;
			System.out.println("Seu peso em Saturno é :"+pesoPlaneta);
			break;
		case 6:
			pesoPlaneta = (pesoTerra / 10) * 1.17;
			System.out.println("Seu peso em Urano é : "+pesoPlaneta);
			break;
			default:
				System.out.println("Código digitado inválido.");
		
		
		
		
		}//fim do switch
		
		
		
		

	}

}
