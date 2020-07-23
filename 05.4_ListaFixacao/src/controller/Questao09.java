package controller;

import util.Teclado;

public class Questao09 {

	/*
	 * Fazer um algoritmo que pe�a um n�mero de 1 a 7, e ao final, informe o dia da
	 * semana (por extenso) correspondente ao n�mero que foi inserido.
	 */
	public static void main(String[] args) {

		int num = 0;

		do {
			num = Teclado.lerInt("Informe um n�mero de 1 a 7.");
			if (num < 1 || num > 7) {
				System.out.println("N�mero inv�lido.");
			}
		} while (num < 1 || num > 7);

		if (num == 1) {
			System.out.println(num + " corresponde a domingo.");
		}
		if (num == 2) {
			System.out.println(num + " corresponde a segunda-feira.");
		}
		if (num == 3) {
			System.out.println(num + " corresponde a ter�a-feira.");
		}
		if (num == 4) {
			System.out.println(num + " corresponde a quarta-feira.");
		}
		if (num == 5) {
			System.out.println(num + " corresponde a quinta-feira.");
		}
		if (num == 6) {
			System.out.println(num + " corresponde a sexta-feira.");
		}
		if (num == 7) {
			System.out.println(num + " corresponde a s�bado.");
		}
		if (num < 1 || num > 7) {
			System.out.println("O n�mero informado � invalido.");
		}
	}

}
