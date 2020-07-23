package controller;

import util.Teclado;

public abstract class Questao08 {

	/*
	 * Fazer um algoritmo que peça um número, e ao final, informe se o número está
	 * abaixo de 1000, entre 1000 e 5000, entre 5000 e 8000, ou acima de 8000.
	 */
	public static void main(String[] args) {

		int num;

		num = Teclado.lerInt("Informe um número.");

		if (num < 1000) {
			System.out.println("O número é menor que 1000.");
		} else {
			if (num <= 5000) {
				System.out.println("O número está entre 1000 e 5000.");
			} else {
				if (num <= 8000) {
					System.out.println("O número está entre 5001 e 8000.");
				} else {
					System.out.println("O número é maior que 8000.");
				}

			}

		}
	}
}
