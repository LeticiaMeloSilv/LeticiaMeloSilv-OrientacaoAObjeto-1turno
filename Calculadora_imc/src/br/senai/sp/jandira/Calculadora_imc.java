//  * Qual é o meu IMC? (ATIVIDADE 02)
//  * 
//  * O índice de massa corporal (IMC) é uma medida internacional usada para
//  * calcular se uma pessoa está no peso ideal. O valor do IMC é o resultado da
//  * divisão do peso pela altura ao quadrado.
//  * 
//  * Escreva um programa de computador, utilizando a linguagem Java, que calcule o
//  * IMC de um indivíduo qualquer. O programa deverá solicitar o nome do usuário,
//  * o peso em Kg e a altura em metros. Após a inclusão dos dados pelo usuário o
//  * sistema deverá apresentar a seguinte informação?
//  * 
//  * Olá <nome>! Seu IMC é <imc>.
//  * 
//  * onde,
//  * 
//  * <nome> é o nome fornecido pelo usuário e <imc> é o resultado da equação
//  * matemática.

package br.senai.sp.jandira;

import java.util.Scanner;

public class Calculadora_imc {

	public static void main(String[] args) {
		Scanner Imc = new Scanner(System.in);
		System.out.println("Nome:");
		String nome = Imc.next();
		System.out.println("Peso(Kg):");
		double peso = Imc.nextDouble();
		System.out.println("Altura:");
		double altura = Imc.nextDouble();
		System.out.println("Olá " + nome + "! Seu IMC é " + peso / Math.pow(altura, 2) + ".");
		Imc.close();
	}

}