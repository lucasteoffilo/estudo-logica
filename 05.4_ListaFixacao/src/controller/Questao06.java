package controller;

import util.Teclado;

public class Questao06 {

	/*
	 * Fazer um algoritmo que pe�a um n�mero, e ao final, informe se o n�mero
	 * digitado est� acima de 1000 ou abaixo de 1000.
	 */
	public static void main(String[] args) {

		int num;

		num = Teclado.lerInt("Informe um n�mero.");

		if (num > 1000) {
			System.out.println("O n�mero informado � ou est� acima de 1000.");
		} else {
			if (num < 1000) {
				System.out.println("O n�mero informado est� abaixo de 1000.");
			} else {
				System.out.println("O n�mero informado � 1000.");
			}
		}

	}

}
