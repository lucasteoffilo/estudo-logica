package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {

		int a, b;

		a = Teclado.lerInt("Informe um número.");
		b = Teclado.lerInt("Informe outro número.");

		System.out.println("Cod  -  Operação");
		System.out.println(" a   -  Média aritmética.");
		System.out.println(" b   -  Diferença do maior pelo menor.");
		System.out.println(" c   -  Produto.");
		System.out.println(" d   -  Divisão do 1º pelo 2º.");

		String op;

		op = Teclado.lerTexto("Informe qual é o 'cod' da operação desejada.");

		switch (op) {

		case "a":
			System.out.println((a + b) / 2);
			break;
		case "b":
			if (a > b) {
				System.out.println(a - b);
			} else {
				System.out.println(b - a);
			}

			break;
		case "c":
			System.out.println(a * b);
			break;
		case "d":
			System.out.println(a / b);
			break;
		default:
			System.out.println("O código inserido está errado.");

		}

	}

}
