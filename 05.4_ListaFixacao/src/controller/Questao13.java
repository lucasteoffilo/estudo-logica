package controller;

import util.Teclado;

public class Questao13 {

	/*
	 * Fazer um algoritmo que pergunte 3 n�meros, e ao final, guarde na vari�vel
	 * maior o maior destes 3 n�meros inseridos. O valor da vari�vel maior dever�
	 * ser exibido ao final.
	 */
	public static void main(String[] args) {

		int num1, num2, num3, maior;

		num1 = Teclado.lerInt("Informe um n�mero.");
		num2 = Teclado.lerInt("Informe mais um n�mero.");
		num3 = Teclado.lerInt("Informe mais um n�mero.");

		maior = num1;
		if (num2 > maior) {
			maior = num2;
		}
		if (num3 > num1) {
			maior = num3;
		}

		System.out.println("Maior = " + maior);
	}

}
