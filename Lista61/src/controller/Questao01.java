package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		System.out.println("  __________________");
		System.out.println(" | Código | Opção   | ");
		System.out.println(" |________|_______  |");
		System.out.println(" |    1   |Incluir  |");
		System.out.println(" |    2   |Alterar  |");
		System.out.println(" |    3   |Excluir  |");
		System.out.println(" |    4   |Pesquisar|");
		System.out.println(" |    5   |Sair     |");
		System.out.println(" |________|_________|");
		
		int opcao = Teclado.lerInt("Opção: ");
		
		
		switch(opcao) {
		case 1:
			System.out.println("Escolheu a opção INCLUIR.");
		break;
		case 2:
			System.out.println("Escolheu a opção ALTERAR.");
			break;
		case 3:
			System.out.println("Escolheu a opção EXCLUIR.");
			break;
		case 4:
			System.out.println("Escolheu a opção PESQUISAR.");
			break;
		case 5:
			System.out.println("Escolheu a opção SAIR.");
			break;
			default:
				System.out.println("Opção inválida.");
		
		}

	}

}
