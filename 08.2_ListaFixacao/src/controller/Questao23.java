package controller;

import util.Teclado;

public class Questao23 {

	public static void main(String[] args) {
		/*
		 * 23) Desenvolver um programa que pergunte valores reais (double) para uma
		 * matriz a de 4 linhas e 5 colunas. Ao final deverá ser exibida na tela a
		 * matriz a e a matriz b que possuirá valores correspondentes à metade do que
		 * existir no mesmo índice da matriz a.
		 */

		double a[][] = new double[4][5];
		double b[][] = new double[4][5];
		int x = 0, y = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				a[x][y] = Teclado.lerDouble("Informe um valor real.");
				b[x][y] = a[x][y] / 2;
				y++;
			}
			x++;
			y = 0;
		}
		x = 0;
		y = 0;
		System.out.println("Matriz A");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(a[x][y] + " ");
				y++;
			}
			x++;
			y = 0;
			System.out.println("");
		}
		x = 0;
		y = 0;
		System.out.println("Matriz B");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(b[x][y] + " ");
				y++;
			}
			x++;
			y = 0;
			System.out.println("");
		}
	}

}
