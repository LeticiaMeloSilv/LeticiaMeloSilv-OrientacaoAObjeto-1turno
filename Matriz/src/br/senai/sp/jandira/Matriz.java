//  * Atividade 17
//  * 
//  * Desenvolver um programa que solicite ao usuário seis números inteiros. Os
//  * números fornecidos pelo usuário devem ser armazenados em uma matriz A do tipo
//  * vetor. No final, apresente o total da soma de todos os elementos que sejam
//  * ímpares.
//  * 
//  * Observação: - Utilize o Scanner para solicitar a entrada dos dados; - Utilize
//  * o laço for para executar esta atividade.

package br.senai.sp.jandira;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] matrizA = new double[6];
		double soma = 0;
		System.out.println("-Insira 6 valores-");
		for (int cont = 0; cont < 6; cont++) {
			System.out.print("Valor " + (cont + 1) + ": ");
			matrizA[cont] = teclado.nextDouble();
		}
		System.out.println("Números Impares da sequencia: ");
		for (int cont = 0; cont < 6; cont++) {
			if (matrizA[cont] / 2 == 1) {
				soma = soma + matrizA[cont];
				System.out.println(matrizA[cont]);
			}
		}
		System.out.println("A soma dos números impares da sequencia é: " + soma);
		teclado.close();

	}
}
