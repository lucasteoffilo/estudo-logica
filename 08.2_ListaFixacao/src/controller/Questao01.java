package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {

		/*
		 * Desenvolver um programa que pergunte um número de 1 a 5, e ao final exiba o
		 * número informado por extenso, ou a frase “o número informado não está entre 1
		 * e 5”.
		 */

		int a;
		String b[] = { "", "Um", "Dois", "Três", "Quatro", "Cinco" };

		a = Teclado.lerInt("Informe um número de 1 a 5.");

		if (a > 0 && a < 6) {
			System.out.println(b[a]);
		} else {
			System.out.println("O número informado não está entre 1 e 5.");
		}

	}

}
