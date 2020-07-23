package controller;

import util.Teclado;

public class Questao02 {

	/*
	 * Fazer um algoritmo que pergunte o valor atual do salário mínimo e o valor do
	 * salário de uma pessoa. Este algoritmo deverá exibir como resposta quantos
	 * salários mínimos esta pessoa ganha.
	 */
	public static void main(String[] args) {

		double a, b;

		a = Teclado.lerDouble("Informe o atual valor do salário minino.");
		b = Teclado.lerDouble("Informe o valor do seu salário.");

		System.out.println("R$" + b + " = " + (b / a) + " salários minimos.");
	}

}
