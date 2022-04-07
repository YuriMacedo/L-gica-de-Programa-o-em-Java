package controller;

import util.Teclado;

public class Questao12 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int maior;
		int menor;
		
		n1 = Teclado.lerInt("Digite o primeiro número :");
		n2 = Teclado.lerInt("Digite o segundo número :");
		n3 = Teclado.lerInt("Digite o terceiro número :");
		n4 = Teclado.lerInt("Digite o quarto número :");
		n5 = Teclado.lerInt("Digite o quinto número :");
		
		maior = n1;
		menor = n1;
		
		if (n2 > maior) 
		maior = n2; {
			
		}
		if (n3 > maior) 
			maior = n3; {
				
			}
			if (n4 > maior) 
				maior = n4; {
					
				}
				if (n5 > maior) 
					maior = n5; {
						
					}
					if (n2 < menor) 
						menor = n2; {
							
						}
						if (n3 < menor) 
							menor = n3; {
								
							}
					
							if (n4 < menor) 
								menor = n4; {
									
								}
								if (n5 < menor) 
									menor = n5; {
									System.out.println("O maior número digitado foi :"+maior);
									System.out.println("O menor número digitado foi :"+menor);
									}
	}

}
