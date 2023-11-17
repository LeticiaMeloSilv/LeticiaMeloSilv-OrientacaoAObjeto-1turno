//  * ATIVIDADE 11
//  * 
//  * Desafio Jokenpô
//  * 
//  * Pedra, papel e tesoura, também chamado em algumas regiões do Brasil de
//  * jokenpô, é um jogo de mãos recreativo e simples para duas ou mais pessoas,
//  * que não requer equipamentos nem habilidade. O jogo é frequentemente empregado
//  * como método de seleção, assim como lançar moedas, jogar dados, entre outros.
//  * 
//  * Você deverá escrever um programa em Java que permita que o usuário jogue
//  * Jokenpô com o computador.
//  * 
//  * As regras são as seguintes:
//  * 
//  * Ao iniciar o programa, um menu deve ser apresentado ao usuário, por exemplo:
//  *************************************
//  * J O K E N P Ô
//  *************************************
//  * 1 - Pedra 2 - Papel 3 - Tesoura
//  * -------------------------------------- Faça a sua escolha (1 à 3)? 2
//  * Você escolheu ----> PAPEL! O PC escolheu ----> TESOURA!
//  *************************************
//  * QUE PENA!! ****** O PC VENCEU!!! 
//  *************************************
//  * No caso do usuário vencer a mensagem final deverá ser:
//  *********************************** 
//  * PARABÉNS!! ****** VOCÊ VENCEU!!! 
//  ************************************
//  * OBSERVAÇÃO: Se o jogador escolher um valor inválido, o jogo deverá ser
//  * finalizado e o usuário deve ser avisado.

package br.senai.sp.jandira;

import java.util.Scanner;
import java.util.Random;

public class Jokenpo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();

		int computador = random.nextInt(3);
		int escolha;

		System.out.println(
				"*************************************\nJ O K E N P Ô\n*************************************\n1 - Pedra\n2 - Papel\n3 - Tesoura\n--------------------------------------\nFaça a sua escolha (1 à 3): ");
		escolha = teclado.nextInt();
		System.out.print("Você escolheu >> ");
		if (escolha == 1) {
			System.out.println("PEDRA");
		} else if (escolha == 2) {
			System.out.println("PAPEL");
		} else if (escolha == 3) {
			System.out.println("TESOURA");
		}
		System.out.print("O PC escolheu >> ");
		if (computador == 0) {
			System.out.println("PEDRA");
		} else if (computador == 1) {
			System.out.println("PAPEL");
		} else if (computador == 2) {
			System.out.println("TESOURA");
		}
		System.out.println("*************************************");
		if (escolha == 1 && computador == 1 || escolha == 2 && computador == 2 || escolha == 3 && computador == 0) {
			System.out.println("Que pena!! O PC VENCEU!!!");
		} else if (escolha == 1 && computador == 2 || escolha == 2 && computador == 0
				|| escolha == 3 && computador == 1) {
			System.out.println("Parabéns!! VOCÊ VENCEU!!!");
		} else if (escolha == 1 && computador == 0 || escolha == 2 && computador == 1
				|| escolha == 3 && computador == 2) {
			System.out.println("VOCÊS EMPATARAM!! tente novamente");
		} else {
			System.out.println("!ERRO! Verifique sua escolha(valor não reconhecido)");
		}
		teclado.close();

	}
}