package controller;

import util.Teclado;

public class Questao21B {

	/*
	 * Fazer um algoritmo que pergunte a idade de 10 pessoas, e ao final, informe
	 * quantas destas pessoas s�o menores de idade.
	 */
	public static void main(String[] args) {

		int id, soma = 0;

		for (int i = 1; i <= 10; i++) {
			id = Teclado.lerInt("Informe a idade de uma pessoa.");
			if (id < 18) {
				soma++;
			}
		}
		System.out.println(soma + " pessoas são menores de idade.");

	}
}
