package controller;

import util.Teclado;

public class Questao06 {

	/*
	 * Desenvolver um programa que leia um n�mero n qualquer menor ou igual a 50 e
	 * apresente o valor obtido da multiplica��o sucessiva de n por 3 enquanto o
	 * produto for menor que 250. (n x 3; n x 3 x 3; n x 3 x 3 x 3 etc...).
	 */
	public static void main(String[] args) {

		int n = 0, r;

		n = Teclado.lerInt("Informe um n�mero menor ou igual a 50.");

		if (n <= 50) {

			r = n * 3;
			
			while (r < 250) {

				System.out.println(n + " x 3 = " + r);
				r = r * 3;

			}
		} else {
			System.out.println("O n�mero informado � maior que 50.");
			System.out.println("Porfavor informe um n�mero menor ou igual a 50.");
		}

	}

}
