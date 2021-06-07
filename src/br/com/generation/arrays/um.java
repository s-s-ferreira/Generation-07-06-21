package br.com.generation.arrays;

public class um {

	public static void main(String[] args) {
		
		int [] A = new int[6];
        int soma =0;
        int valor = 0, mais = 105;



        A[0] = 1;
        A[1] = 0;
        A[2] = 5;
        A[3] = -2;
        A[4] = -5;
        A[5] = 7;


        soma += A[0] + A[1] +A[5];
        mais += valor = A[4];

        for(int i = 0;i <=5; i++) {
        System.out.println(i + ": " + A[i]);

        }
        System.out.println("RESULTADO DA SOMA ==> " + soma);
        System.out.println("RESULTADO POSIÇÃO 04 ==> "+ mais);

        A[0] = 1;
        A[1] = 0;
        A[2] = 5;
        A[3] = -2;
        A[4] = -5;
        A[5] = 7;

	}

}
