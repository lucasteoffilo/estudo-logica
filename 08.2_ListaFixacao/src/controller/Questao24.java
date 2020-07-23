package controller;

import util.Teclado;

public class Questao24 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte valores reais (double) para uma matriz a
		 * de 4 linhas e 5 colunas. O programa deverá então gerar o vetor b de 5
		 * posições, onde cada uma posição do vetor b receberá o valor da soma de todos
		 * os valores da coluna correspondente na matriz a. Exibir ao final a matriz a e
		 * o vetor b.Desenvolver um programa que pergunte valores reais (double) para
		 * uma matriz a de 4 linhas e 5 colunas. O programa deverá então gerar o vetor b
		 * de 5 posições, onde cada uma posição do vetor b receberá o valor da soma de
		 * todos os valores da coluna correspondente na matriz a. Exibir ao final a
		 * matriz a e o vetor b.
		 */

		double a[][] = new double[4][5];
		double b[] = new double[5];
		// loop de pergunta
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = Teclado.lerDouble("Informe um valor real.");
			}
		}
		// exibindo matriz informada
		System.out.println("Matriz");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		// somando colunas da matriz
		double aux = 0;
		for (int coluna = 0; coluna < 5; coluna++) {
			for (int linha = 0; linha < 4; linha++) {
				aux = aux + a[coluna][linha];
			}
			b[coluna] = aux;
			aux = 0;
		}
		// exibindo vetor com soma das colunas
		System.out.println("Vetor");
		for (int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}

	}
}
