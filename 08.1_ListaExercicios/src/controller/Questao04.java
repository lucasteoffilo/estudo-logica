package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que crie uma matriz de 5 linhas e 2 colunas. Pergunte
		 * ao usuário números para preencher toda a matriz, e ao final, exiba a matriz
		 * inteira e a média dos números da matriz.
		 */

		int a[][] = new int[5][2];

		// perguntando matriz
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Teclado.lerInt("Informe um número.");
			}
		}
		// exibindo matriz
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

		// calculando media
		double med = a.length * a[0].length;
		int aux = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				aux = aux + a[i][j];
			}
		}
		med = aux / med;
		System.out.println("Media dos números da matriz: " + med);
	}

}
