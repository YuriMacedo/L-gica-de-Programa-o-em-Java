package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		System.out.println("  __________________");
		System.out.println(" | C�digo | Op��o   | ");
		System.out.println(" |________|_______  |");
		System.out.println(" |    1   |Incluir  |");
		System.out.println(" |    2   |Alterar  |");
		System.out.println(" |    3   |Excluir  |");
		System.out.println(" |    4   |Pesquisar|");
		System.out.println(" |    5   |Sair     |");
		System.out.println(" |________|_________|");
		
		int opcao = Teclado.lerInt("Op��o: ");
		
		
		switch(opcao) {
		case 1:
			System.out.println("Escolheu a op��o INCLUIR.");
		break;
		case 2:
			System.out.println("Escolheu a op��o ALTERAR.");
			break;
		case 3:
			System.out.println("Escolheu a op��o EXCLUIR.");
			break;
		case 4:
			System.out.println("Escolheu a op��o PESQUISAR.");
			break;
		case 5:
			System.out.println("Escolheu a op��o SAIR.");
			break;
			default:
				System.out.println("Op��o inv�lida.");
		
		}

	}

}
