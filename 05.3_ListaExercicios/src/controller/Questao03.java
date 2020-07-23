package controller;

import util.Teclado;

public class Questao03 {

	/*
	 * Desenvolver um programa que apresente os resultados de uma tabuada de um
	 * número qualquer informado pelo usuário.
	 */
	public static void main(String[] args) {

		int a, b;
		String c = "s";

		for (; c.equals("s") || c.equals("S");) {
			a = Teclado.lerInt("Informe o número da tabuada desejada.");
			for (b = 1; b <= 10; b++) {
				System.out.println(a + " x " + b + " = " + a * b);

			}
			c = Teclado.lerTexto("Deseja continuar? 'S' para sim ou 'N' para não.");
		}

	}

}
