package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte ao usuário dez elementos de um vetor a,
		 * construa um vetor b do mesmo tipo, observando a seguinte lei de formação: se
		 * o valor do índice for par, o elemento deve ser multiplicado por 5; sendo
		 * ímpar, deve ser somado a 5. Ao final, mostrar os conteúdos dos dois vetores.
		 */

		double a[] = new double[10];
		double b[] = new double[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = Teclado.lerDouble("Informe um número.");
			if (a[i] % 2 == 0) {
				b[i] = a[i] * 5;
			} else {
				b[i] = a[i] + 5;
			}

		}
		System.out.println("VETOR 1  -  VETOR 2");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " - " + b[i]);
		}
	}

}
