package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		
		System.out.println(" ___________________________________________");
		System.out.println("|C�digo|"+" Planeta |"+" Gravidade Relativa |");
		System.out.println("|  1   |"+" Merc�rio|"+"        0,37        |");
		System.out.println("|  2   |"+" V�nus   |"+"        0,88        |");
		System.out.println("|  3   |"+" Marte   |"+"        0,38        |");
		System.out.println("|  4   |"+" J�piter |"+"        2,64        |");
		System.out.println("|  5   |"+" Saturno |"+"        1,15        |");
		System.out.println("|  6   |"+" Urano   |"+"        1,17        |");
		System.out.println("|______|____________|_______________________|");
		
		
		
		int codigo = Teclado.lerInt("Digite o c�digo.");
		double pesoTerra = Teclado.lerInt("Digite o seu peso.");
		double pesoPlaneta = 0;
		
		switch(codigo) {
		case 1:
			
			pesoPlaneta = (pesoTerra / 10) * 0.37;
			
			System.out.println("Seu peso em Merc�rio � : "+pesoPlaneta);
			break;
		case 2:
			pesoPlaneta = (pesoTerra / 10) * 0.88;
			System.out.println("Seu peso em V�nus � :"+pesoPlaneta);
			break;
		case 3:
			pesoPlaneta = (pesoTerra / 10) * 0.38;
			System.out.println("Seu peso em Marte � : "+pesoPlaneta);
			break;
		case 4:
			pesoPlaneta = (pesoTerra / 10) * 2.64;
			System.out.println("Seu peso em J�piter � :"+pesoPlaneta);
			break;
		case 5:
			pesoPlaneta = (pesoTerra / 10) * 1.15;
			System.out.println("Seu peso em Saturno � :"+pesoPlaneta);
			break;
		case 6:
			pesoPlaneta = (pesoTerra / 10) * 1.17;
			System.out.println("Seu peso em Urano � : "+pesoPlaneta);
			break;
			default:
				System.out.println("C�digo digitado inv�lido.");
		
		
		
		
		}//fim do switch
		
		
		
		

	}

}
