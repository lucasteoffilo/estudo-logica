package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {

		int num;
		num = Teclado.lerInt("Informe um n�mero.");
		if (num > 0) {
			System.out.println("O n�mero informado � positivo.");
		} else {
			if (num < 0) {
				System.out.println("O n�mero informado � negativo.");
			} else {
				System.out.println("O n�mero informado � nulo.");
			}
		}
	}

}
