package controller;

import util.Teclado;

public abstract class Questao08 {

	/*
	 * Fazer um algoritmo que pe�a um n�mero, e ao final, informe se o n�mero est�
	 * abaixo de 1000, entre 1000 e 5000, entre 5000 e 8000, ou acima de 8000.
	 */
	public static void main(String[] args) {

		int num;

		num = Teclado.lerInt("Informe um n�mero.");

		if (num < 1000) {
			System.out.println("O n�mero � menor que 1000.");
		} else {
			if (num <= 5000) {
				System.out.println("O n�mero est� entre 1000 e 5000.");
			} else {
				if (num <= 8000) {
					System.out.println("O n�mero est� entre 5001 e 8000.");
				} else {
					System.out.println("O n�mero � maior que 8000.");
				}

			}

		}
	}
}
