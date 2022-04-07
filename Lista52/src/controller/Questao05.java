package controller;

public class Questao05 {

	public static void main(String[] args) {
		int i;
		
		
		i = 0;
		System.out.println("Número divisíveis por 4 menor que 20 : ");
		do {
			
			if(i % 4 == 0) {
				
				System.out.println(i);
			}//fim do if
			
			i++;
		}while(i < 20);
		

	}

}
