// * ATIVIDADE 08
// * 
// * Reajuste de salário
// * 
// * A empresa Acme Ltda. vai proporcionar um aumento de salário para os seus
// * funcionários, mas este aumento deverá seguir algumas regras, são elas:
// * 
// * 1 - O funcionário receberá um reajuste de 15% caso o seu salário atual seja
// * menor do que 1500;
// * 
// * 2 - Se o salário for maior ou igual a 1500, mas menor ou igual a 3000, seu
// * reajuste será de 10%;
// * 
// * 3 - Caso o salário seja maior que 3000, o reajuste deverá ser de 5%.
// * 
// * Para facilitar o trabalho do RH em determinar o novo salário dos funcionários
// * você deve desenvolver um programa, em Java, que efetue os cálculos. O
// * programa deverá solicitar o nome do funcionário e o seu salário atual.
// * 
// * Ao concluir a entrada de dados o sistema deverá exibir o nome do funcionário,
// * o percentual de reajuste, e o salário novo com reajuste.
// * 
// * Use a sua criatividade pra implementar a interação com o usuário ;)
// * 
// * Enviar o projeto para celso@celso.dev.br, com o assunto Atividade 08.
// *
// * B O M   T R A B A L H O 

package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class Reajuste_de_salario {

	public static void main(String[] args) {
		String nome, salario1;
		double salario, reajuste, valorFinal;
		JOptionPane.showMessageDialog(null,
				"---------------------------------------------\n                            Reajuste salárial\n ---------------------------------------------");
		nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
		salario1 = JOptionPane.showInputDialog(null, "Salario atual: ");
		salario = Integer.parseInt(salario1);
		if (salario < 1500) {
			reajuste = salario * 0.15;
			double valorfinal = reajuste + salario;
			JOptionPane.showMessageDialog(null, "Olá " + nome + "! Seu antigo salario era de" + salario
					+ " mas, com o reajuste de 15%, voce passará a receber " + valorfinal + "!");
		} else {
			if (salario <= 3000) {
				reajuste = salario * 0.10;
				double valorfinal = reajuste + salario;
				JOptionPane.showMessageDialog(null, "Olá " + nome + "! Seu antigo salario era de" + salario
						+ " mas, com o reajuste de 10%, voce passará a receber " + valorfinal + "!");
			} else {
				reajuste = salario * 0.05;
				double valorfinal = reajuste + salario;
				JOptionPane.showMessageDialog(null, "Olá " + nome + "! Seu antigo salario era de" + salario
						+ " mas, com o reajuste de 5%, voce passará a receber " + valorfinal + "!");
			}
		}
	}
}
