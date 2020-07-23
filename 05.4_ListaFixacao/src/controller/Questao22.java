package controller;

import util.Teclado;

public abstract class Questao22 {

	/*
	 * Fazer um algoritmo que pergunte um n�mero positivo, e exiba na tela a lista
	 * de n�meros de 1 at� o n�mero informado.
	 */
	public static void main(String[] args) {

		int i = 0;
		do {
			i = Teclado.lerInt("Informe um número positivo.");
			if (i <= 0) {
				System.out.println("Número inválido.");
			}
		} while (i <= 0);
		for (int a = 1; a <= i; a++) {
			System.out.println(a);
		}
	}

}
