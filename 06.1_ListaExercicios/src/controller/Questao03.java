package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {

		int a;

		a = Teclado.lerInt("Informe um número.");

		a = a % 2;
		switch (a) {

		case 0:
			System.out.println("O número é par.");
			break;
		default:
			System.out.println("O número é impar.");
		}
	}

}
