package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		
		System.out.println("  _______________________________________________________");
		System.out.println(" | C�digo | Opera��o                                     | ");
		System.out.println(" |________|______________________________________________|");
		System.out.println(" |    A   |M�dia Aritim�tica entre os n�meros digitados  |");
		System.out.println(" |    B   |Diferen�a do maior pelo menor                 |");
		System.out.println(" |    C   |Produto entre os n�mero digitados             |");
		System.out.println(" |    D   |Divis�o do primeiro n�mero pelo segundo       |");
		System.out.println(" |________|______________________________________________|");
		
		String codigo = Teclado.lerTexto("Digite o c�digo.");
		double n1 = Teclado.lerDouble("Digite o primeiro n�mero.");
		double n2 = Teclado.lerDouble("Digite o segundo n�mero.");
		
		
		switch(codigo.toUpperCase()) {
		case "A":
			System.out.println("A m�dia dos n�meros "+n1+" e "+n2+" � : "+ (n1 + n2)/2);
			break;
		case "B":
			if(n1 > n2) {
				
			System.out.println("A diferen�a de "+n1+" - "+n2+" � igual �: "+ (n1-n2));	
				
				
			}else {
				
				System.out.println("A diferen�a de "+n2+" - "+n1+" � igual �: "+ (n2-n1));
			}//fim do else
			
			break;
		case "C":
			System.out.println("O produto de "+n1+" e"+n2+" � igual �: "+(n1 *n2));
			break;
		case "D":
			System.out.println("A divis�o de "+n1+" por "+n2+" � igual � : "+(n1 / n2));
			default:
				System.out.println("Erro,c�digo digitado inv�lido.");
		
		
		
		
		}//fim do switch
		
		

	}

}
