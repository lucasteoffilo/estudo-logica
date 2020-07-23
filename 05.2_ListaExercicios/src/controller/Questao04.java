package controller;

import util.Teclado;

public class Questao04 {

	/*
	 * Desenvolver um programa que apresente os resultados de uma tabuada de um
	 * número n qualquer a ser perguntado ao usuário (n x 1, n x 2, n x 3, ... , n x
	 * 9, n x 10)
	 */
	public static void main(String[] args) {

		int i = 1, a;

		a = Teclado.lerInt("Informe a tabuada desejada.");
		do {
			System.out.println(a + " x " + i + " = " + (a * i));
			i++;
		} while (i <= 10);
	}

}
