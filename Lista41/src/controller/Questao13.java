package controller;

import util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		int numer1;
        int numer2;
        int numer3;
        int aux;
         
        numer1 = Teclado.lerInt("Digite o primeiro número :");
        numer2 = Teclado.lerInt("Digite o segundo número :");
        numer3 = Teclado.lerInt("Digite o terceiro número :");
         
        if (numer1 > numer2 ) {
            aux = numer1;
            numer1 = numer2;
            numer2 = aux;
        }
        if (numer1 > numer3) {
            aux = numer1;
            numer1 = numer3;
            numer3 = aux;
        }
        if(numer2 >numer3) {
            aux = numer2;
            numer2 = numer3;
            numer3 = aux;
             
        }
        System.out.println(numer1+","+numer2+","+numer3);
         
 
    }
 
}

	
