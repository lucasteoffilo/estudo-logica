package controller;

import util.Teclado;

public class Questao06 {

	/*
	 * Fazer um algoritmo que peça um número, e ao final, informe se o número
	 * digitado está acima de 1000 ou abaixo de 1000.
	 */
	public static void main(String[] args) {

		int num;

		num = Teclado.lerInt("Informe um número.");

		if (num > 1000) {
			System.out.println("O número informado é ou está acima de 1000.");
		} else {
			if (num < 1000) {
				System.out.println("O número informado está abaixo de 1000.");
			} else {
				System.out.println("O número informado é 1000.");
			}
		}

	}

}
