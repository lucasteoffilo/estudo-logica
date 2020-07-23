package controller;

import util.Teclado;

public class LacoVariavelDeControle {

	public static void main(String[] args) {

		int r, x, i;
		for (i = 0; i < 5; i++) {
			x = Teclado.lerInt("Informe um número:");
			r = x * 3;
			System.out.println(x + " * 3 = " + r);
		}
	}

}
