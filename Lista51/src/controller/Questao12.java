package controller;

import util.Teclado;

public class Questao12 {

	public static void main(String[] args) {
		int i;
		int numer;
		int maior;
		int menor;
		int soma;
		int media;
		
		numer = Teclado.lerInt("Digite um n�mero: ");
		
		menor = numer;
		maior = numer;
		soma = 0;
		i = 0;
		
		while (numer != -1) {
			
			if(menor > numer ) {
				menor = numer;
			}//fim do if
			
			if(maior < numer) {
				maior = numer;
			}//fim do if
			
			 soma = soma + numer;
			 numer = Teclado.lerInt("Digite um n�mero: ");
			
			i = i + 1;
		}//fim do while
		
		media = soma /i;
		
		
				if (menor == -1) {
					System.out.println("O primeiro n�mero digitado foi -1");
					
				}else {
				System.out.println("O maior valor digitado foi: "+maior);
				System.out.println("O menor valor digitado foi: "+menor);
				System.out.println("A m�dia dos n�meros digitados � :"+(media));
					
				}//fim do else
 
                		
	}

}
