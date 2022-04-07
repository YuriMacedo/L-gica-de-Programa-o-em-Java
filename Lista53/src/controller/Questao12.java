package controller;

public class Questao12 {

	public static void main(String[] args) {
		
          for(int i = 1 ; i <= 10 ; i++ ) {
			
			for(int j = 1 ; j <= 10 ; j++) {
				
				System.out.print(i+" - "+j+"\t");
				if(i < j){
				System.out.println("x-x\t");
				
			}//fim do 2º for  	
			System.out.println();
			}//fim do if
			
			
		}//fim do for

	}

}
