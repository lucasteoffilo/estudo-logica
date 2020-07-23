package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {

		/*
		 * Desenvolver um programa que crie uma matriz com 5 linhas e 3 colunas.
		 * Pergunte ao usuário o conteúdo desta matriz e ao final exiba a matriz
		 * inteira.
		 */

		int a[][] = new int[5][3];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = Teclado.lerInt("Informe um número.");
			}

		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
