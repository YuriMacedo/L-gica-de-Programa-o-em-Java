package controller;

public class Questao03 {

	public static void main(String[] args) {
		int i;
		int soma;
		soma = 0;
		i = 1;
		
		do {
			soma = soma + i;
			
						
			i = i + 1;	
		}while(i <= 5);
		
		System.out.println("Soma dos 5 primeiros números inteiros : "+soma);

	}

}
