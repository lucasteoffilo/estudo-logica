package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		/*
		 * 6) Desenvolver um programa que crie uma matriz com 3 linhas e 5 colunas. As 4
		 * primeiras colunas de todas as linhas deverão ser preenchidas com números
		 * informados pelo usuário. A 5ª coluna deverá receber a média dos 4 valores
		 * existentes na mesma linha (das 4 primeiras colunas). Ao final exiba toda a
		 * matriz.
		 */

		double a[][] = new double[3][5];
		double med[] = new double[3];

		// perguntando e calculando média
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length - 1; j++) {
				a[i][j] = Teclado.lerDouble("Informe um número.");
				med[i] = med[i] + a[i][j];
			}
			med[i] = med[i] / 4;
		}
		// inserindo media na matriz
		for (int i = 0; i < a.length; i++) {
			a[i][4] = med[i];

		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
