package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que crie uma matriz de 4 linhas e 3 colunas. Pergunte
		 * ao usuário números para preencher toda a matriz, e ao final, exiba a matriz
		 * inteira e a soma dos números pares contidos na matriz.
		 */

		int a[][] = new int[4][3];

		// perguntando matriz
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Teclado.lerInt("Informe um número.");
			}
		}
		// exibindo matriz
		System.out.println("Matriz");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

		int soma = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 == 0) {
					soma = soma + a[i][j];
				}
			}
		}
		System.out.println("Soma do números pares: " + soma);
	}

}
