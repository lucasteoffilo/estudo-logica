package controller;

import util.Teclado;

public class Questao13 {

	/*
	 * Desenvolver um programa que pergunte 3 valores (variáveis a, b e c) e ao
	 * final apresente-os dispostos em ordem crescente.
	 */

	public static void main(String[] args) {

		int a, b, c, primeiro, segundo, terceiro;
		a = Teclado.lerInt("Informe um número."); // 3
		b = Teclado.lerInt("Informe outro número."); // 2
		c = Teclado.lerInt("Informe outro número."); // 1

		primeiro = a;
		segundo = a;
		terceiro = a;

		if (b < primeiro) {
			primeiro = b;
		}
		if (c < primeiro) {
			primeiro = c;
		}

		if (b > primeiro) {
			terceiro = b;
		}
		if (c > primeiro) {
			terceiro = c;
		}

		if (b > primeiro && b < terceiro) {
			segundo = b;
		}
		if (c > primeiro && c < terceiro) {
			segundo = c;
		}


		System.out.println("1º = " + primeiro);
		System.out.println("2º = " + segundo);
		System.out.println("3º = " + terceiro);
	}

}
