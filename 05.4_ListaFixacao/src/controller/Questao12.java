package controller;

import util.Teclado;

public class Questao12 {

	/*
	 * Fazer um algoritmo que pergunte 2 números, e ao final, exiba como resposta na
	 * tela qual é o maior e qual é o menor, ou ainda, se ambos são iguais.
	 */
	public static void main(String[] args) {

		int num1, num2, aux1;

		num1 = Teclado.lerInt("Informe um número.");
		num2 = Teclado.lerInt("Informe mais um número.");

		if (num2 > num1) {
			aux1 = num1;
			num1 = num2;
			num2 = aux1;
		} else {
			if (num1 == num2) {
				System.out.println(num1 + " = " + num2);
				System.out.println("Os números são iguais");
			} else {
				if (num1 > num2) {
					System.out.println("Maior = " + num1);
					System.out.println("Menor = " + num2);

				}
			}
		}
	}

}
