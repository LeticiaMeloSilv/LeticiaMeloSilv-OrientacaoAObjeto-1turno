
//  * Atividade 12
//  * 
//  * Escreva um programa, em Java, que solicite o nome do usuário e quantas vezes
//  * ele deseja ver o nome repetido na tela. utilize o Scanner para essa tarefa.

package br.senai.sp.jandira;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		int vezes;
		System.out.println("Qual é o seu nome?");
		nome = teclado.next();
		System.out.println("Olá, pequeno narcisista! quantas vezes você quer que seu nome seja repetido?");
		vezes = teclado.nextInt();
		while (vezes > 0) {
			System.out.println(nome);
			vezes = vezes - 1;
		}
		System.out.println("Só isso, Tchauuu!!!");
		teclado.close();
	}

}