package controller;

import util.Teclado;

public class Questao14 {

	/*
	 * Fazer um algoritmo que pergunte a idade de uma pessoa, e ao final, informe na
	 * tela se a pessoa � menor de idade, se � maior de idade, ou se � maior de 65
	 * anos.
	 */
	public static void main(String[] args) {

		int i;

		i = Teclado.lerInt("Informe a idade.");

		if (i < 18) {
			System.out.println("Essa pessoa � menor de idade.");
		}
		if (i >= 18 && i <= 65) {
			System.out.println("Essa pessoa � maior de idade.");
		}
		if (i >= 65) {
			System.out.println("Essa pessoa tem mais que 65 anos.");
		}

	}

}
