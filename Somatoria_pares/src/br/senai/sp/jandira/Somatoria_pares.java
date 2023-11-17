//  * Atividade 15
//  * 
//  * Elaborar um programa que apresente a somatória dos números pares de 1 até 50.
//  * Utilize o laço FOR para executar essa tarefa. Apresente o resultado no
//  * console.

package br.senai.sp.jandira;

public class Somatoria_pares {

	public static void main(String[] args) {
		int resultado=0;
		System.out.println("Números Pares Entre 1 e 50");
		for(int x=2; x<=50; x+=2) {
			System.out.print(x+" \n");
		}
		for(int x=0; x<=50; x++) {
			if(x%2==0) 
				resultado+=x;
			}
			System.out.println("Somatória dos Números Pares Entre 1 e 50 igual a: "+resultado);
	}

}