package controller;

import util.Teclado;

public class Questao13 {

	/*
	 * Sabendo-se que uma Polegada equivale a 2,54 centímetros, desenvolver um
	 * programa que exiba uma tabela de conversões de polegadas para centímetros, de
	 * 1 polegada até um valor inteiro de polegada inserido pelo usuário.
	 */
	public static void main(String[] args) {

		double p = 2.54, a, b;

		a = Teclado.lerDouble("Insira o valor inteiro da polegada.");
		for (b = 1; b <= a; b++) {
			System.out.println(b + " polegada(s) é igual à " + p * b + " centímetros.");

		}

	}

}
