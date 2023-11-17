//  * Atividade 14
//  * 
//  * Você deve escrever um programa que permita ao usuário obter a tabuada de
//  * qualquer número selecionado por ele. Por exemplo, deve ser possível obtermos
//  * a tabuada do 97 começando no 74 até o 128.
//  * 
//  * O sistema deverá solicitar ao usuário o multiplicando, o mínimo e o máximo
//  * multiplicador, e a partir daí gerar a tabuada que deverá ser apresentada ao
//  * usuário.
//  * 
//  * Exemplo:
//  * 
//  * Se o usuário escolher o multiplicando 7, o mínimo multiplicador 3 e o máximo
//  * multiplicador 8, deverá ser apresentada a seguinte saída ao usuário:
//  * 
//  * Tabuada do 7 ------------------------- 7 X 3 = 21 7 X 4 = 28 7 X 5 = 35 7 X 6
//  * = 42 7 X 7 = 49 7 X 8 = 56 F I M -------------------------
//  * 
//  * Utilize o Scanner para executar a tarefa.

package br.senai.sp.jandira;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int multiplicando, min, max, resultado, cont;
		System.out.println("Multiplicando: ");
		multiplicando = teclado.nextInt();
		System.out.println("Mínimo multiplicador: ");
		min = teclado.nextInt();
		System.out.println("Máximo multiplicador: ");
		max = teclado.nextInt();
		cont = min;
		System.out.println("Tabuada do " + multiplicando);
		if (min < max) {
			while (cont <= max) {
				resultado = multiplicando * cont;
				System.out.println(multiplicando + " * " + cont + " = " + resultado);
				cont++;
			}
		} else {
			System.out.println("!ERRO! Verifique se os valores inseridos estão corretos");
		}
		teclado.close();
	}

}