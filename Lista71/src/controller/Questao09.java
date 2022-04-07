package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		
		String[] nomes = new String[10];
		String pesquisa;
		String nomePesqui;
		boolean achou = false;
		
		for(int i = 0 ;i < nomes.length ;i++) {
			
			nomes[i] = Teclado.lerTexto("Digite o nome : ");		
			
		}//fim do for
		
		pesquisa = Teclado.lerTexto("Você quer fazer umas pesquisa dos nomes ? ");
		
		while(pesquisa.equals("SIM")) {
			
			nomePesqui = Teclado.lerTexto("Informe o nome para buscar");
			for(int i = 0 ; i < nomes.length; i++) {
				
				if(nomePesqui.equals(nomes[i])) {
					
					achou = true;
					
				}//fim do if
				
			}//fim do for
			
			if(achou) {
				
				System.out.println("Nome encontrado.");
				
			}else {
				
				System.out.println("Nome não encontrado.");
				
			}//fim do else
			nomePesqui = Teclado.lerTexto("Deseja pesquisar novamente.");
			
		}//fim do while
			
		

	}

}
