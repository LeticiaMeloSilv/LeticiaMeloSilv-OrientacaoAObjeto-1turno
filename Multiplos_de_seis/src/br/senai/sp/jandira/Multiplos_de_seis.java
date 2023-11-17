//  * Atividade 13
//  * 
//  * Escreva um programa, em Java, que solicite ao usuário dois valores. O
//  * programa deverá exibir todos os valores múltiplos de 6 entre o menor e o
//  * maior valor fornecidos. Utilize o Scanner para executar esta tarefa.
//13° Atividade

package br.senai.sp.jandira;

import java.util.Scanner;

public class Multiplos_de_seis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int v1, v2;
		System.out.println("---------------------------\n     MÚLTIPLOS DE SEIS \n---------------------------");
		System.out.println("Qual é o primeiro valor?");
		v1 = teclado.nextInt();
		System.out.println("Qual é o segundo valor?");
		v2 = teclado.nextInt();
		System.out.println("Os números dentro desse intervalo são:");
		if (v1 < v2) {
			while (v1 <= v2) {
				if (v1 % 6 == 0) {
					System.out.println(v1);
				}
				v1 = v1 + 1;
			}
		} else {
			while (v1 >= v2) {
				if (v1 % 6 == 0) {
					System.out.println(v1);
				}
				v1 = v1 - 1;
			}
		}
		teclado.close();
	}
}