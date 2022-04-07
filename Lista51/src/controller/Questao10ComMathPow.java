package controller;

public class Questao10ComMathPow {

	public static void main(String[] args) {
		double i;
		double aux;
		i= 0;
		
		
		
		while (i <= 15) {
			aux = Math.pow(3,i );
			
			System.out.println("3 elevado a "+i+" = "+aux);
					
			i = i + 1;
		}

	}

}
