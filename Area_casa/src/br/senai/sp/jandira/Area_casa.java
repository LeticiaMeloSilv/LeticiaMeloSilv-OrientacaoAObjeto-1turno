//  Atividade 16
//  * 
//  * Elabore um programa que possibilite calcular a área total de uma residência
//  * (sala, cozinha, banheiro, quartos, área de serviço, etc.). O programa deve
//  * solicitar a entrada do nome, a largura e o comprimento de um determinado
//  * cômodo. Em seguida deve apresentar a área do cômodo lido e também uma
//  * mensagem solicitando ao usuário a confirmação de continuar calculando novos
//  * cômodos. Caso o usuário responda "N", o programa deve apresentar o valor
//  * total acumulado da área da residência.
//  * 
//  * Para concluir esta tarefa você deverá, obrigatoriamente, utilizar a instrução
//  * For.
//  * 
//  * =======================================================================
//  * OBSERVAÇÃO
//  * ======================================================================= Para
//  * efetuar uma comparação de igualdade entre strings, não utilizamos o sinal de
//  * igualdade (==). Para isso devemos utilizar o método "equals" das strings.
//  * Suponhamos que você tenha duas variáveis, pet1 e pet2 e você deseja saber se
//  * ambas as variáveis possuem o mesmo valor, você deverá utilizar o seguinte
//  * comando:
//  * 
//  * pet1.equals(pet2)
//  * 
//  * A expressão acima resultará em "true" caso as variáveis possuam o mesmo
//  * valor, caso contrário a expressão resultará em "false".
//  * ========================================================================

package br.senai.sp.jandira;

import java.util.Scanner;

public class Area_casa {

	public static void main(String[] args) {

		String nome, outro;

		int largura, comprimento, Ac, Acs = (int) 0.0;

		Scanner teclado = new Scanner(System.in);

		System.out.println(
				"Qual é a area da sua casa? \n-----------------------------\n\nDeseja adcionar um cômodo para o calculo?(S/N)");
		outro = teclado.next();
		System.out.println("-----------------------------------------------------------");
		for (; outro.equals("S") || outro.equals("s") || outro.equals("Sim");) {
			System.out.println("Tipo do cômodo:");

			nome = teclado.next();

			System.out.println("Quanto mede sua largura?");

			largura = teclado.nextInt();

			System.out.println("Quanto mede seu comprimento?");

			comprimento = teclado.nextInt();
			Ac = comprimento * largura;

			System.out
					.println("A area do cômodo " + nome + " é igual a: " + Ac + " Deseja adcionar outro cômodo?(S/N)");

			outro = teclado.next();

			Acs += Ac;

			System.out.println("--------------------------------------------------------------------------");

			teclado.close();
		}
		System.out.println("A area total da sua casa é: " + Acs);
	}

}