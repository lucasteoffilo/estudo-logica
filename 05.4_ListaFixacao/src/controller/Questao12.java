package controller;

import util.Teclado;

public class Questao12 {

	/*
	 * Fazer um algoritmo que pergunte 2 n�meros, e ao final, exiba como resposta na
	 * tela qual � o maior e qual � o menor, ou ainda, se ambos s�o iguais.
	 */
	public static void main(String[] args) {

		int num1, num2, aux1;

		num1 = Teclado.lerInt("Informe um n�mero.");
		num2 = Teclado.lerInt("Informe mais um n�mero.");

		if (num2 > num1) {
			aux1 = num1;
			num1 = num2;
			num2 = aux1;
		} else {
			if (num1 == num2) {
				System.out.println(num1 + " = " + num2);
				System.out.println("Os n�meros s�o iguais");
			} else {
				if (num1 > num2) {
					System.out.println("Maior = " + num1);
					System.out.println("Menor = " + num2);

				}
			}
		}
	}

}
