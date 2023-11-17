//  * Gasolina ou álcool? Atividade 06
//  * 
//  * No Brasil, utiliza-se gasolina ou etanol nos veículos de passeio. Dependendo
//  * do valor destes combustíveis, pode ser mais vantajoso encher o tanque com um
//  * ou com outro.
//  * 
//  * Segundo um padrão estabelecido já há alguns anos, o litro do etanol rende, em
//  * média, 70% da mesma quantidade de gasolina. Sendo assim, você deve
//  * multiplicar o preço do litro da gasolina por 0,7. Se o resultado for inferior
//  * ao preço do litro do álcool, valeria a pena abastecer com gasolina.
//  * 
//  * Faça um programa que indique ao motorista se é mais vantajoso encher o tanque
//  * com álcool ou gasolina.
//  * 
//  * Sugestão de interface:
//  *****************************
//  * GASOLINA OU ÁLCOOL?
//  *****************************
//  * Preço da gasolina: xxx Preço do álcool: xxx
//  *****************************
//  * No momento é mais vantajoso abastecer com GASOLINA!

package br.senai.sp.jandira;

import java.util.Scanner;

public class Gasolina_ou_alcool {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("------------------------------");
		System.out.println("     Gasolina ou Álcool");
		System.out.println("------------------------------");
		System.out.print("Preço da Gasolina: ");
		double Gasolina = teclado.nextDouble();
		System.out.print("Preço do Álcool: ");
		double Alcool = teclado.nextDouble();
		double Vantagem = (Gasolina * 0.7);
		if (Vantagem < Alcool) {
			System.out.println("Atualmente, é mais vantajoso abastecer seu veículo com >Gasolina<");
		} else {
			System.out.println("Atualmente, é mais vantajoso abastecer seu veículo com >Álcool<");
		}
		teclado.close();
	}

}