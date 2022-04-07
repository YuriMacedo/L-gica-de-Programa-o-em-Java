package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		String [] nomes = new String [15];
		double [] pr1 = new double [15];
		double [] pr2 = new double [15];
		double [] media = new double [15];
		String [] situacao = new String [15];
		
		for(int i = 0 ; i < nomes.length ; i++) {
			
			nomes[i] = Teclado.lerTexto("Digite o nome do Aluno : ");
			pr1[i] = Teclado.lerDouble("Digite a nota da PR1: ");
			pr2[i] = Teclado.lerDouble("Digite a nota da PR2 : ");
			
			media[i] = (pr1[i] + pr2[i]) / 2; 
			
		}
		for(int i = 0 ; i < nomes.length ; i++) {
			
			if(media[i] >= 7) {
				situacao[i] = "está Aprovado.";
				
				
			}else {
				situacao[i] = "está Reprovado.";
				
				
				
			}//fim do else
			
			System.out.println("O aluno "+nomes[i]+"  "+situacao[i]);
			System.out.println("Nota PR1 : "+pr1[i]+"     PR2 : "+pr2[i]);
			System.out.println("Média : "+media[i]);
			
			
		} 

	}

}
