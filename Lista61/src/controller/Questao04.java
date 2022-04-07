package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		String estado = Teclado.lerTexto("Digite a sigla do estado.");
		
		
		switch(estado) {
		case "RJ":
		case "Rj":
		case "rj":
			System.out.println("Carioca.");
			break;
		case "SP":
		case "Sp":
		case "sp":
			System.out.println("Paulista.");
			break;
		case "MG":
		case "Mg":
		case "mg":
			
			System.out.println("Mineiro.");
			break;
			default:
				System.out.println("Outros estados.");
		
		
		
		
		}//fim do switch

	}

}
