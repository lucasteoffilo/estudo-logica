package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {

		int num1;
		num1 = Teclado.lerInt("Informe um n�mero");
		if (num1 >= 0) {
			System.out.println("Modulo: " + num1);
		} else {
			System.out.println("Modulo: " + num1 * -1);

		}

	}

}
