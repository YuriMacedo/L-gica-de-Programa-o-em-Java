package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		double[] va = new double [5];
		double[] vb = new double [5];
		
		for(int i = 0 ; i < 5 ; i++) {
			
			va[i] = Teclado.lerDouble("Digite o número : ");
			
			
			
		}
		for(int i = 0 ; i < 5 ; i++) {
			
			System.out.println("Valores A : "+va[i]);
			
		}
		
		for(int i = 0 ; i < 5 ; i++) {
			
			vb[i] = Math.pow(va[i], 2);
			
			System.out.println("Valores B :"+vb[i]);
			
			
		}//fim do 2° for
		

	}

}
