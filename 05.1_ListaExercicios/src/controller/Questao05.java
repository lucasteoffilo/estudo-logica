package controller;

import util.Teclado;

public class Questao05 {

	/*
	 * 1) Desenvolver um programa que apresente os resultados de uma tabela de um
	 * número qualquer. Ela deve ser impressa no seguinte formato:
	 * 
	 * Considerando como exemplo o fornecimento do número 2
	 * 
	 * 2 . 1 = 2 | 2 . 2 = 4 A 2 . 3 = 6 2 . 4 = 8 2 . 5 = 10 (...) 2 . 10 = 20
	 * 
	 */
	public static void main(String[] args) {

		int i, n;
		i = 1;
		n = Teclado.lerInt("Informe um n�mero.");
		while (i <= 10) {
			System.out.println(n + " * " + i + " = " + (n * i));
			i = i + 1;
		}

	}

}
