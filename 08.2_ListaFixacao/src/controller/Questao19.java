package controller;

public class Questao19 {

	public static void main(String[] args) {

		/*
		 * 19) Desenvolva um programa que gere uma matriz 3 x 4 vazia, preencha-a
		 * através de rotinas de repetição (laços) com os valores abaixo e exiba-a: 90
		 * 89 88 87 86 85 84 83 82 81 80 79
		 */

		int a[][] = new int[3][4];
		int x = 0, y = 0;
		for (int i = 90; i > 86; i = i - 1) {
			a[x][y] = i;
			y++;
		}
		x = 1;
		y = 0;
		for (int i = 86; i > 82; i = i - 1) {
			a[x][y] = i;
			y++;
		}
		x = 2;
		y = 0;
		for (int i = 82; i > 78; i = i - 1) {
			a[x][y] = i;
			y++;
		}
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println("\n------------");
		}

	}

}
