package controller;

import util.Teclado;

public class Questao13 {

	/*
	 * Fazer um algoritmo que pergunte 3 números, e ao final, guarde na variável
	 * maior o maior destes 3 números inseridos. O valor da variável maior deverá
	 * ser exibido ao final.
	 */
	public static void main(String[] args) {

		int num1, num2, num3, maior;

		num1 = Teclado.lerInt("Informe um número.");
		num2 = Teclado.lerInt("Informe mais um número.");
		num3 = Teclado.lerInt("Informe mais um número.");

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
