package controller;

import util.Teclado;

public class Questao02 {

	/*
	 * Fazer um algoritmo que pergunte o valor atual do sal�rio m�nimo e o valor do
	 * sal�rio de uma pessoa. Este algoritmo dever� exibir como resposta quantos
	 * sal�rios m�nimos esta pessoa ganha.
	 */
	public static void main(String[] args) {

		double a, b;

		a = Teclado.lerDouble("Informe o atual valor do sal�rio minino.");
		b = Teclado.lerDouble("Informe o valor do seu sal�rio.");

		System.out.println("R$" + b + " = " + (b / a) + " sal�rios minimos.");
	}

}
