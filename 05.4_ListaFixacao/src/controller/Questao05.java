package controller;

import util.Teclado;

public class Questao05 {

	/*
	 * Fazer um algoritmo que peça um número de 3 dígitos, e ao final, o exiba de
	 * forma invertida. (Exemplo: Se o usuário digitar o número 123, deverá ser
	 * exibido como resposta o número 321).
	 */
	public static void main(String[] args) {

		int num, a, b, c;

		num = Teclado.lerInt("Informe um número de 3 dígitos.");
		a = num / 100;
		b = (num % 100) / 10;
		c = (num % 100) % 10;

		num = (c * 100) + (b * 10) + a;
		System.out.println(num);
	}

}
