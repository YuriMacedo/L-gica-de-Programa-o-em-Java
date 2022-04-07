package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		
		System.out.println("  _______________________________________________________");
		System.out.println(" | Código | Operação                                     | ");
		System.out.println(" |________|______________________________________________|");
		System.out.println(" |    A   |Média Aritimética entre os números digitados  |");
		System.out.println(" |    B   |Diferença do maior pelo menor                 |");
		System.out.println(" |    C   |Produto entre os número digitados             |");
		System.out.println(" |    D   |Divisão do primeiro número pelo segundo       |");
		System.out.println(" |________|______________________________________________|");
		
		String codigo = Teclado.lerTexto("Digite o código.");
		double n1 = Teclado.lerDouble("Digite o primeiro número.");
		double n2 = Teclado.lerDouble("Digite o segundo número.");
		
		
		switch(codigo.toUpperCase()) {
		case "A":
			System.out.println("A média dos números "+n1+" e "+n2+" é : "+ (n1 + n2)/2);
			break;
		case "B":
			if(n1 > n2) {
				
			System.out.println("A diferença de "+n1+" - "+n2+" é igual à: "+ (n1-n2));	
				
				
			}else {
				
				System.out.println("A diferença de "+n2+" - "+n1+" é igual à: "+ (n2-n1));
			}//fim do else
			
			break;
		case "C":
			System.out.println("O produto de "+n1+" e"+n2+" é igual à: "+(n1 *n2));
			break;
		case "D":
			System.out.println("A divisão de "+n1+" por "+n2+" é igual à : "+(n1 / n2));
			default:
				System.out.println("Erro,código digitado inválido.");
		
		
		
		
		}//fim do switch
		
		

	}

}
