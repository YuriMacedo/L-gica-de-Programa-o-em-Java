package controller;

public class Questao09 {

	public static void main(String[] args) {
		int v1;
		int v2;
		int v3;
		int i;
		
		i = 1;
		
		v1 = 1;
		v2 = 1;
		
		
		
		do {
			System.out.println("O 15º termo de Fibonacci é : "+v1);	
			v3 = v1 + v2;
			v1 = v2;
			v2 = v3;
			
		i++;	
		}while(i <= 15);
		
		

	}

}
