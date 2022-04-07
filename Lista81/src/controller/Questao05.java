package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		String[][] nomes = new String[4][4];
		
		for (int i = 0; i < nomes.length; i++) {
			for (int j = 0; j < nomes[i].length; j++) {
				nomes[i][j]=Teclado.lerTexto("Nome ["+i+","+j+"]: "); 
			}
		}
		System.out.println("Exibição de nomes:");
		int linha = Teclado.lerInt("Informe a linha para consulta (de 0 a 3):");
		int coluna = Teclado.lerInt("Informe a coluna para consulta (de 0 a 3):");
		
		while((linha>=0) && (linha<=3) && (coluna>=0) && (coluna<=3)) {
			System.out.println("Nome encontrado: "+nomes[linha][coluna]+"\n");
			linha = Teclado.lerInt("Informe outra linha para consulta (de 0 a 3):");
			coluna = Teclado.lerInt("Informe outra coluna para consulta (de 0 a 3):");
		}
		
		System.out.println("Coordenadas inválidas.");

	}

}
