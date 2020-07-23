package controller;

import util.Teclado;

public class Questao23 {

	/*
	 * Fazer um algoritmo que pergunte 20 números e ao final exiba a média destes 20
	 * números.
	 */
	public static void main(String[] args) {

		double a = 0, i, med = 0;

		for (i = 0; i < 20; i++) {
			med = med + a;
			a = Teclado.lerInt("Informe outro n�mero");

		}
		System.out.println("A m�dia dos n�meros � = " + med / i);
		System.out.println(i);

	}

}
