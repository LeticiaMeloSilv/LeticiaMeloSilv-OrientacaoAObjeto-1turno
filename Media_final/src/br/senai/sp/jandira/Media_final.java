//  * Qual a média final do aluno? (ATIVIDADE 03)
//  * 
//  * ATIVIDADE 03 - Uma escola calcula a nota final do aluno efetuando a média
//  * simples entre as notas obtidas em cada bimestre. Você deverá construir um
//  * programa em Java que calcule a média final do aluno. O programa deverá
//  * solicitar o nome do aluno e as quatro notas equivalentes a cada bimestre. A
//  * interação do usuário com o programa deverá ser da seguinte forma:
//  **************************
//  * MÉDIA FINAL
//  **************************
//  * 
//  * Nome do aluno: Pedro Nota do bimestre 1: 8,8 Nota do bimestre 2: 9,5 Nota do
//  * bimestre 3: 7,3 Nota do bimestre 4: 9,2
//  * 
//  * ------------------------------------
//  * Pedro, a sua nota final é 8,7
//  * ------------------------------------

package br.senai.sp.jandira;

import java.util.Scanner;

public class Media_final {

	public static void main(String[] args) {

		Scanner media = new Scanner(System.in);
		System.out.println("******************");
		System.out.println("MÉDIA FINAL");
		System.out.println("******************");
		System.out.print("Nome do Aluno:");
		String Nome = media.next();
		System.out.print("Nota do 1º bimestre:");
		double bimestre1 = media.nextDouble();
		System.out.print("Nota do 2º bimestre:");
		double bimestre2 = media.nextDouble();
		System.out.print("Nota do 3º bimestre:");
		double bimestre3 = media.nextDouble();
		System.out.print("Nota do 4º bimestre:");
		double bimestre4 = media.nextDouble();
		System.out.println("-------------------");
		double nota = (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4;
		System.out.println("A nota final do(a) aluno(a) " + (Nome) + " é " + nota);
		System.out.println("-------------------");

		media.close();
	}

}