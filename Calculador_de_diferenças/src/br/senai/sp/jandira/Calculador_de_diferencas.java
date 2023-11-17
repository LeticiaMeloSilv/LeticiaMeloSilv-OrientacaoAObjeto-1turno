//  * Atividade 07
//  * 
//  * Subtração de dois números
//  * 
//  * Você deve escrever um programa em Java, que receba dois valores numéricos
//  * inteiros e apresente a diferença do maior valor pelo menor valor.

package br.senai.sp.jandira;

import java.util.Scanner;

public class Calculador_de_diferencas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("      Calculadora");
		System.out.println("---------------------------");
		System.out.println("Qual é o primeiro valor?");
		double valor1 = teclado.nextDouble();
		System.out.println("Qual é o segundo valor?");
		double valor2 = teclado.nextDouble();
		System.out.println("---------------------------");
		if (valor1 < valor2) {
			double diferenca1 = (valor2 - valor1);
			System.out.println("A diferença entre " + (valor1) + " e " + (valor2) + " é de " + (diferenca1));
		} else {
			double diferenca2 = (valor1 - valor2);
			System.out.println("A diferença entre " + (valor1) + " e " + (valor2) + " é de " + (diferenca2));
		}
		teclado.close();
	}

}