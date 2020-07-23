package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {

		int num;
		num = Teclado.lerInt("Informe um número.");
		if (num > 0) {
			System.out.println("O número informado é positivo.");
		} else {
			if (num < 0) {
				System.out.println("O número informado é negativo.");
			} else {
				System.out.println("O número informado é nulo.");
			}
		}
	}

}
