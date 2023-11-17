// * Combustível gasto (ATIVIDADE 04)
//  * 
//  * A empresa Chega Rápido Transportes é uma empresa do ramo de transportes para
//  * executivos. A Chega Rápido atende clientes dos mais diversos níveis com uma
//  * variada frota de carros.
//  * 
//  * Atualmente a empresa tem enfrentado problemas no cálculo dos valores gastos
//  * com combustível e o(a) contratou para desenvolver uma solução que permita
//  * prever o valor aproximado em Reais gasto em cada viagem.
//  * 
//  * Após avaliar as necessidades da solução você chegou à seguinte conclusão:
//  * 
//  * Ao iniciar o programa, deverá ser fornecido o modelo do carro, a autonomia, a
//  * distância da viagem e o valor do combustível.
//  * 
//  * O sistema deverá apresentar a seguinte interface para o usuário:
//  * 
//  * ----------------------------------------- 
//  * CONSUMO DE COMBUSTÍVEL
//  * ----------------------------------------- 
//  * Modelo do carro? Monza 
//  * Autonomia do carro? 12 
//  * Distância da viagem? 350 
//  * Preço do combustível? 5,49
//  * ----------------------------------------- 
//  * R E S U L T A D O
//  * ----------------------------------------- 
//  * Modelo do veículo: <modelo>
//  * Autonomia do veículo: <autonomia>
//  *  Km/l Distância percorrida: <distancia> Km
//  * Valor do combustível: R$ <valor>
//  * ----------------------------------------- 
//  * Quantidade de combustível utilizado: <quantidade> l Total gasto com a viagem: R$ <total>
//  * -----------------------------------------
//  * 
//  * Onde, <modelo> é o modelo do carro fornecido, <autonomia> é a autonomia do
//  * veículo por km, <distancia> representa a distância da viagem, <quantidade> é
//  * a quantidade de combustível gasto na viagem, <valor> é o preço do combustível
//  * informado e <total> é o valor gasto em reais.
//  * 
//  * Orientações:
//  * 
//  * Autonomia refere-se à distância que um veículo consegue percorrer com 1 litro
//  * de combustível. Por exemplo, se dissermos que um carro tem autonomia de 17
//  * quilômetros por litro, estamos dizendo que com 1 litro de combustível o
//  * veículo irá percorrer 17 quilômetros.

package br.senai.sp.jandira;

import java.util.Scanner;

public class Gasto_combustivel{

	public static void main(String[] args) {
		String modelo;
		int autonomia, distancia, quantidade;
		double valor,total;

		Scanner teclado= new Scanner(System.in);

		System.out.print("Modelo: ");
		modelo=teclado.next();
		System.out.print("Autonomia: ");
		autonomia=teclado.nextInt();
		System.out.print("Distância Percorrida: ");
		distancia=teclado.nextInt();
		System.out.print("Preço do Combustivel: R$ ");
		valor=teclado.nextDouble();

		quantidade=distancia/autonomia;
		total=quantidade*valor;

		System.out.println("------------------"+modelo+"-------------------");
		System.out.println("Quantidade de combustível utilizado: "+ quantidade+"l");
		System.out.println("Total gasto com a viagem: R$ "+total);
        teclado.close();
	}
}
