package controller;

import util.Teclado;

public class Questao07 {

	/*
	 * Fazer um algoritmo que pe�a um n�mero, e ao final, informe se o n�mero est�
	 * abaixo de 1000, entre 1000 e 5000, ou acima de 5000.
	 */
	public static void main(String[] args) {

		int num;

		num = Teclado.lerInt("Informe um n�mero.");

		if (num < 1000) {
			System.out.println("O n�mero informado � menor que 1000.");
		} else {

			if (num >= 1000 && num <= 5000) {
				System.out.println("O n�mero informado est� entre 1000 e 5000.");
			} else {
				System.out.println("O n�mero informado � maior que 5000.");
			}

		}

	}
}
