package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		double numer1;
		double numer2;
		double numer3;
		double numer4;
		double media;
		
		numer1 = Teclado.lerDouble("Digite a 1° nota: ");
		numer2 = Teclado.lerDouble("Digite a 2º nota: ");
		numer3 = Teclado.lerDouble("Digite a 3º nota: ");
		numer4= Teclado.lerDouble("Digite a 4º nota: ");
		
		media = (numer1 + numer2 + numer3 + numer4)/4;
				
	if(media >= 5) {
		System.out.println("O aluno esta aprovado com a media : "+media);
	}else{
		System.out.println("O aluno esta reprovado com media : "+media);
	}
	}
}


