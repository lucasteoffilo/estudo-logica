package controller;

import util.Teclado;

public class Questao07 {

	/*
	 * Fazer um algoritmo que peça um número, e ao final, informe se o número está
	 * abaixo de 1000, entre 1000 e 5000, ou acima de 5000.
	 */
	public static void main(String[] args) {

		int num;

		num = Teclado.lerInt("Informe um número.");

		if (num < 1000) {
			System.out.println("O número informado é menor que 1000.");
		} else {

			if (num >= 1000 && num <= 5000) {
				System.out.println("O número informado está entre 1000 e 5000.");
			} else {
				System.out.println("O número informado é maior que 5000.");
			}

		}

	}
}
