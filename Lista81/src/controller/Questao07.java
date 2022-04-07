package controller;

public class Questao07 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][4];
		int n=11;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = n;
				n++;				
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
}





