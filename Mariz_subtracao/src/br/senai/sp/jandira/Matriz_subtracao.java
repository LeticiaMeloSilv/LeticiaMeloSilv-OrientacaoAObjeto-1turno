//  * Atividade 19
//  * 
//  * Desenvolver um programa que solicite ao usuário o preenchimento de duas
//  * matrizes do tipo vetor, A e B. Cada matriz deve ter o tamanho 6. Ao finalizar
//  * a entrada de dados, o sistema deverá criar uma terceira matriz C, do tipo
//  * vetor, onde cada índice armazenará o valor da subtração do mesmo índice nas
//  * matrizes A e B. Por exemplo, em C[0] deverá ser armazenado o valor de A[0] -
//  * B[0], em C[1] deverá ser armazenado o valor de A[1] - B[1] e assim
//  * sucessivamente até completar a matriz C.
//  * 
//  * Atenção, utilize laço while para executar essa atividade.

package br.senai.sp.jandira;
import java.util.Scanner;

public class Matriz_subtracao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double[] matrizA = new double[6];
		double[] matrizB = new double[6];
		double[] matrizC = new double[6];
		int cont = 0;
		System.out.println("Insira 6 valores\nMatriz A");
		while (cont < 6) {
			System.out.print("Valor " + (cont + 1) + ": ");
			matrizA[cont] = teclado.nextDouble();
			cont++;
		}
		System.out.println("Matriz B");
		cont = 0;
		while (cont < 6) {
			System.out.print("Valor " + (cont + 1) + ": ");
			matrizB[cont] = teclado.nextDouble();
			cont++;
		}
		cont = 0;
		while (cont < matrizA.length) {
			if (matrizA[cont] > matrizB[cont]) {
				matrizC[cont] = matrizA[cont] - matrizB[cont];
			} else {
				matrizC[cont] = matrizB[cont] - matrizA[cont];
			}
			System.out.println(matrizC[cont]);
			cont++;
		}
		teclado.close();

	}
}