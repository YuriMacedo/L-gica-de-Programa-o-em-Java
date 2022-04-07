package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
				
		
		for(int i = 1 ; i <= 20 ; i++) {
			String nome = Teclado.lerTexto("Digite o nome.");
			String sexo  = Teclado.lerTexto("Digite o sexo.");
			int idade = Teclado.lerInt("Digite a idade.");
			
			if(sexo.equals("Masculino") && (idade >= 21)) {
				
				System.out.println(nome+" possui "+idade+" anos");
				
			}//fim do if
			
			
		}//fim do for

	}

}
