//  * TIPOS DE TRIÂNGULOS(ATIVIDADE 09)
//  * 
//  * O seu professor de geometria pediu a sua ajuda para desenvolver um programa,
//  * em Java, que determine se uma forma geométrica de 3 lados é um triângulo.
//  * Caso a forma geométrica seja um triângulo também deverá ser determinado se o
//  * triângulo é isósceles, escaleno ou equilátero.
//  *
//  * O que é um triângulo?
//  * 
//  * Um triângulo é uma forma geométrica composta por três lados, e o valor de
//  * cada lado deve ser menor que a soma dos valores dos outros dois lados.
//  * Perceba que é uma regra (uma condição) e deve ser plenamente considerada.
//  * Assim sendo, é um triângulo quando A < B+C, quando B < A+C e quando C < A+B,
//  * considerando como lados as variáveis a, b e c.
//  * 
//  * Tipos de triângulo
//  * 
//  * Tendo certeza de que os três valores informados para os três lados formam um
//  * triângulo, determine se o triângulo é isósceles, escaleno ou equilátero,
//  * sendo:
//  * 
//  * >>ISÓSCELES Quando possui dois lados iguais e um diferente, sendo A=B ou A=C
//  * ou B=C.
//  * 
//  * >>ESCALENO Quando possui todos os lados diferentes, sendo A diferente de B e
//  * B diferente de C.
//  * 
//  * >>EQUILÁTERO Quando todos os lados são iguais, sendo A=B e B=C.
//  * 
//  * Fique à vontade para decidir como será a interação do usuário com o seu
//  * aplicativo.
//  * 
//  * Enviar o projeto para celso@celso.dev.br, com o assunto Atividade 09.
//  * 
//  * B O M   T R A B A L H O ! ! !

// package br.senai.sp.jandira;
package br.senai.sp.jandira;

import java.util.Scanner;

public class Triangulos{

	public static void main(String[] args) {
		double ladoA,ladoB,ladoC;

		Scanner teclado= new Scanner(System.in);
	
		System.out.print("Qual o tipo do seu Triângulo??\nLado A: ");
		ladoA=teclado.nextInt();
		System.out.print("Lado B: ");
		ladoB=teclado.nextInt();
		System.out.print("Lado C: ");
		ladoC=teclado.nextInt();
		
		if(ladoA<ladoB+ladoC || ladoB<ladoA+ladoC || ladoC<ladoA+ladoB){
			if(ladoA==ladoB && ladoA!=ladoC || ladoA==ladoC && ladoA!=ladoB || ladoB==ladoC && ladoC!=ladoA){
				System.out.println("SEU TRIÂNGULO É: ");
				System.out.println(">>Isósceles");
			}
			else if(ladoA!=ladoB||ladoA!=ladoC||ladoB!=ladoC){
				System.out.println("SEU TRIÂNGULO É: ");
				System.out.println(">>Escaleno");				
			}
			else if(ladoA==ladoB||ladoA==ladoC||ladoB==ladoC){
				System.out.println("SEU TRIÂNGULO É: ");
				System.out.println(">>Equilátero");				
			}
			else{
				System.out.println("Perdão, Não consegui reconhecer o tipo, tente novamente");
			}	
		}
		else{
			System.out.println("Perdão, Não consegui reconhecer o triângulo, verifique os valores inseridos");
		}
        teclado.close();
	}
}

