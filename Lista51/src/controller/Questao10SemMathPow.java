package controller;

public class Questao10SemMathPow {

	public static void main(String[] args) {
		int i;
		int numer;
		
		i = 0;
		numer = 1;
		
		while(i <= 15) {
			
			System.out.println("3 elevado à "+i+" = "+numer);
			
			
			numer = numer * 3;
			
			
			i = i + 1;
		}//final do while

	}

}
