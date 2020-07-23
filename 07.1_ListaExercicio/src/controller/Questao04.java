package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {

		/*
		 * Desenvolver um programa que pergunte oito elementos em um vetor a, construa
		 * um vetor b de mesma dimensão com os elementos do vetor a multiplicados por 3.
		 * Apresente ao final o vetor b. Na exibição, o elemento b[1] deve ser implicado
		 * pelo elemento a[1] * 3, o elemento b[2] implicado pelo a[2] * 3, e assim por
		 * diante, até 8.
		 * 
		 */

		double a[] = new double[8];
		double b[] = new double[8];

		for (int i = 0; i < 8; i++) {
			a[i] = Teclado.lerDouble("Informe um número.");
			b[i] = a[i] * 3;
		}
		for (int c = 0; c < 8; c++) {
			System.out.println((c + 1) + "º número informado multiplicado por 3 = " + b[c]);
		}
	}

}
