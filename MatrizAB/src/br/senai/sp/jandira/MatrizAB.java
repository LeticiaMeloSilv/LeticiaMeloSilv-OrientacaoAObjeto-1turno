//  * Atividade 18
//  * 
//  * Desenvolver um programa que leia dez elementos de uma matriz A do tipo vetor.
//  * Construir uma matriz B de mesmo tipo, observando a seguinte lei de formação:
//  * se o valor do índice for par, o valor deve ser multiplicado por 5, sendo
//  * ímpar, deve ser somado com 5. Ao final mostrar o conteúdo da matriz B.
//  * 
//  * Atenção, utilizar laço For para execução deste projeto.

package br.senai.sp.jandira;

public class MatrizAB {
	public static void main(String[] args) {
		double[] matrizA = new double[10];
		double[] matrizB = new double[10];
		int cont = 0;
		while (cont < 10) {
			matrizA[cont] = cont + 1;
			cont++;
		}
		cont = 0;
		for (; cont < 10; cont++) {
			if (cont / 2 == 0) {
				matrizB[cont] = matrizA[cont] * 5;
			} else {
				matrizB[cont] = matrizA[cont] + 5;
			}
			System.out.println(matrizB[cont]);
		}

	}
}
