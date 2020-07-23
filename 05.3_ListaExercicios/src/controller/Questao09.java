package controller;

import util.Teclado;

public class Questao09 {

	/*
	 * Desenvolver um programa que pergunte um número inteiro e exiba os números que
	 * são, ao mesmo tempo, múltiplos de 3 e 5, na sequência de 1 até o número
	 * informado pelo usuário.
	 */
	public static void main(String[] args) {

		int a, i;
		a = Teclado.lerInt("Informe um número.");
		for (i = 1; i <= a; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}

	}

}
