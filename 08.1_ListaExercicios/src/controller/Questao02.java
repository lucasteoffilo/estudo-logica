package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que crie uma matriz com 3 linhas e 2 colunas.
		 * Pergunte ao usuário números para preencher toda a matriz, e ao final exiba a
		 * matriz inteira e também a soma dos números desta matriz.
		 */

		int a[][] = new int[3][2];

		// perguntando números
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = Teclado.lerInt("Informe um número.");
			}

		}
		// exibindo matriz
		System.out.println("Matriz");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		// somando e exibindo a matriz

		int soma = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				soma = soma + a[i][j];

			}
		}
		System.out.println("Soma da Matriz: " + soma);
	}

}