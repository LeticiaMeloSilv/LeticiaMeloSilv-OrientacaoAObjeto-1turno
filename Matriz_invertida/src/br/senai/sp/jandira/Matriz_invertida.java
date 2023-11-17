//  * Atividade 20
//  * 
//  * Desenvolver um programa que que construa uma matriz A do tipo vetor com 20
//  * elementos. Construir uma matriz B do tipo vetor que armazene os valores da
//  * matriz A invertidos. Por exemplo, o valor armazenado no primeiro índice de A
//  * deverá ser armazenado no último índice de B, o valor armazenado no segundo
//  * índice de A deverá ser armazenado no penúltimo índice de B.
//  * 
//  * Observação, utilize o while para executar essa tarefa.
package br.senai.sp.jandira;

public class Matriz_invertida {

	public static void main(String[] args) {
		double[] matrizA = new double[10];
		double[] matrizB = new double[10];
		int indice = 0, cont = 0;
		while (cont < 10) {
			matrizA[cont] = cont + 1;
			cont++;
		}
		System.out.println("---Matriz B---");
		while (indice < 10) {
			cont--;
			matrizB[indice] = matrizA[cont];
			System.out.println(matrizB[indice]);
			indice++;
		}
	}
}