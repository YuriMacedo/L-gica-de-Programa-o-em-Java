package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
	  String sexo = Teclado.lerTexto("Digite o seu sexo.");
	  
	  switch (sexo) {
	  case "Masculino":
	  case "masculino":  
		  System.out.println("Banheiro masculino � direita.");
		  break;
	  case "Feminino":
	  case "feminino":
		  System.out.println("Banheiro feminino � esquerda.");
		  break;
		  default:
			  System.out.println("Op��o inv�lida.");
	  }//fim do switch

	}

}
