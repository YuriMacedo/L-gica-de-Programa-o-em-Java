package controller;

public class Questao06 {

	public static void main(String[] args) {
	  int i;
	  
	  i = 2;
	  
	  System.out.println("Quadrados dos números 2 à 50 : ");
	  do {
		  
		  System.out.println(Math.pow(i, 2));
		  
		i++;  
	  }while(i <= 50);

	}

}
