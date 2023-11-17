//  * Qual é o meu IMC, PARTE 2? (ATIVIDADE 10)
//  * 
//  * O índice de massa corporal (IMC) é uma medida internacional usada para
//  * calcular se uma pessoa está no peso ideal. O valor do IMC é o resultado da
//  * divisão do peso pela altura ao quadrado.
//  * 
//  * Escreva um programa de computador, utilizando a linguagem Java, que calcule o
//  * IMC de um indivíduo qualquer. O programa deverá solicitar o nome do usuário,
//  * o peso em Kg e a altura em metros.
//  * 
//  * Esse sistema também deverá apresentar a situação atual do indivíduo, por
//  * exemplo, se está abaixo do peso, acima do peso, peso ideal, etc. Para isso
//  * use como referência a seguinte tabela:
//  * 
//  * +----------------------------------------------------------------------------
//  * --------+ | VALOR IMC | SITUAÇÃO DO INDIVÍDUO |
//  * +-----------------------------------------+----------------------------------
//  * --------+ |Menor que 18,5 |Abaixo do peso normal |
//  * +-----------------------------------------+----------------------------------
//  * --------+ |Maior ou igual a 18,5 e menor que 25,0 |Peso normal |
//  * +-----------------------------------------+----------------------------------
//  * --------+ |Maior ou igual a 25,0 e menor que 30,0 |Sobrepeso |
//  * +-----------------------------------------+----------------------------------
//  * --------+ |Maior ou igual a 30,0 e menor que 35,0 |Obesidade nível I |
//  * +-----------------------------------------+----------------------------------
//  * --------+ |Maior ou igual a 35,0 e menor que 40,0 |Obesidade nível II |
//  * +-----------------------------------------+----------------------------------
//  * --------+ |Maior ou igual a 40,0 |Obesidade nível III |
//  * +----------------------------------------------------------------------------
//  * --------+
//  * 
//  * Utilize o JOptionPane (message ou input dialog) para solicitar e exibir as
//  * mensagens para os usuários.

package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class Calculadora_imc1 {

	public static void main(String[] args) {
		String nome, pesoString, alturaString, situacao;
		double imc, peso, altura;

		nome = JOptionPane.showInputDialog(null, "Nome: ");
		pesoString = JOptionPane.showInputDialog(null, "Peso: ");
		alturaString = JOptionPane.showInputDialog(null, "Altura: ");

		// pesoString.replaceAll( "," , "." );
		peso = Double.parseDouble(pesoString);
		// alturaString.replaceAll( "," , "." );
		altura = Double.parseDouble(alturaString);

		imc = peso / (altura * altura);
		if (imc < 18.5) {
			situacao = "Abaixo do peso";
		} else if (imc >= 18.5 && imc < 25.0) {
			situacao = "Peso normal";
		} else if (imc >= 25.0 && imc < 30.0) {
			situacao = "Sobrepeso";
		} else if (imc >= 30.0 && imc < 35.0) {
			situacao = "Obesidade nível I";
		} else if (imc >= 35.0 && imc < 40.0) {
			situacao = "Obesidade nível II";
		} else if (imc >= 40.0) {
			situacao = "Obesidade nível III";
		} else {
			situacao = "Perdão, Não consegui realizar o calculo, tente novamente";
		}

		JOptionPane.showMessageDialog(null, "Olá" + nome + "\nSeu IMC é igual a: " + imc + "\nSituação: " + situacao);
	}
}
