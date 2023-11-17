//  * Quantos dias eu já vivi, aproximadamente? (ATIVIDADE 01)
//  * 
//  * Escreva um programa em Java que pergunte a idade do usuário em anos, e
//  * devolva uma mensagem da seguinte forma:
//  * 
//  * Você já viveu aproximadamente ... dias!

package br.senai.sp.jandira;

import java.util.Scanner;

public class Dias_vividos {

    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);
        System.out.println("insira sua idade:");
        double A = idade.nextDouble();
        double B = 365;
        System.out.println("você já viveu:");
        System.out.println(A * B);
        idade.close();
    }

}