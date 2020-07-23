package controller;

public class Questao20 {

	public static void main(String[] args) {
		/*
		 * 20) Desenvolva um programa que gere uma matriz 3 x 4 vazia, preencha-a
		 * através de rotinas de repetição (laços) com os valores abaixo e exiba-a: 15
		 * 17 19 21 23 25 27 29 31 33 35 37
		 */

		int a[][] = new int[3][4];
		int x = 0, y = 0;
		for (int i = 15; i < 22; i = i + 2) {
			a[x][y] = i;
			y++;
		}
		x = 1;
		y = 0;
		for (int i = 23; i < 30; i = i + 2) {
			a[x][y] = i;
			y++;
		}
		x = 2;
		y = 0;
		for (int i = 31; i < 38; i = i + 2) {
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
