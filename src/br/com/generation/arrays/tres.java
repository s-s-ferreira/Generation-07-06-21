package br.com.generation.arrays;

import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double [][] matriz = new double [3][3];
		double valores = 0.0;
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				System.out.printf("Digite os números: [%d] [%d]", 1, c);
				matriz[l][c] = entrada.nextDouble();
				
				if(matriz[l][c] > 10) {
					valores++;
				}
			}
		}
		
		System.out.println("\nVocê digitou " + valores + " acima de 10");
		
		entrada.close();

	}

}
