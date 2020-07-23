package controller;

import util.Teclado;

public class Questao05 {

	/*
	 * Fazer um algoritmo que pe�a um n�mero de 3 d�gitos, e ao final, o exiba de
	 * forma invertida. (Exemplo: Se o usu�rio digitar o n�mero 123, dever� ser
	 * exibido como resposta o n�mero 321).
	 */
	public static void main(String[] args) {

		int num, a, b, c;

		num = Teclado.lerInt("Informe um n�mero de 3 d�gitos.");
		a = num / 100;
		b = (num % 100) / 10;
		c = (num % 100) % 10;

		num = (c * 100) + (b * 10) + a;
		System.out.println(num);
	}

}
