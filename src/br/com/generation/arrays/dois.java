package br.com.generation.arrays;

import java.util.Scanner;


public class dois {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
		
		int[] numeros = new int[6];
		int somapar = 0, qntimpar = 0;
		
		for(int i = 0; i <= 5; i++) {
			
			System.out.printf("Digite um n�mero: ");
			numeros [i] = entrada.nextInt();
			
			if(numeros [i]%2 == 0) {
				
				somapar+=numeros[i];
				
			}
			
			else{
				
				qntimpar++;
				
			}
			
		}
		
			System.out.printf("\nOs n�meros pares digitados foram: ");
			
			for(int i=0; i<=5; i++) {
				
				if(numeros[i]%2 == 0){
					
				System.out.printf(" %d ", numeros[i]);}
				
			}
			
			System.out.printf("\nOs n�meros impares digitados foram: ");
			
			for(int i=0; i<=5; i++) {
				
				if(numeros[i]%2 != 0) {
					
				System.out.printf(" %d ", numeros[i]);}
				
			}
			
			System.out.printf("\nA soma dos n�meros pares �: %d", somapar);
			System.out.printf("\nA quantidade de n�meros impares �: %d", qntimpar);
			
			entrada.close();
		
	}

}
