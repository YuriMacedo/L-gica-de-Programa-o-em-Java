package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		
		int[] v1 = new int[20];
		int[] v2 = new int [20];
		
		
		for(int i = 0 ; i < 20; i++) {
			
			v1[i] = Teclado.lerInt("Digite um número : ");
			
			v2[19 - i] = v1[i];
			
			
		
		}//fim do for
		
		System.out.print("Valores de A : ");
		for(int i = 0 ; i < 20 ; i++) {
			
			System.out.print(" "+v1[i]);
			
			
		}//fim do for
		
		System.out.print(" \n Valores de B : ");
		for(int i = 0 ; i < 20 ; i++) {
			System.out.print(" "+v2[i]);
			
			
		}
		
		
			
			
			
			
		}
		
			
		

	}


