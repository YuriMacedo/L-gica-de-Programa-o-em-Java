package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
	  String sexo = Teclado.lerTexto("Digite o seu sexo.");
	  
	  switch (sexo) {
	  case "Masculino":
	  case "masculino":  
		  System.out.println("Banheiro masculino à direita.");
		  break;
	  case "Feminino":
	  case "feminino":
		  System.out.println("Banheiro feminino à esquerda.");
		  break;
		  default:
			  System.out.println("Opção inválida.");
	  }//fim do switch

	}

}
