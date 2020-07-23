package controller;

public class Questao21 {

	public static void main(String[] args) {
		/*
		 * 21) Desenvolva um programa que gere uma matriz 3 x 4 vazia, preencha-a
		 * através de rotinas de repetição (laços) com os valores abaixo e exiba-a: 30
		 * 31 32 33 40 41 42 43 50 51 52 53
		 */

		int a[][] = new int[3][4];
		int x = 0, y = 0;
		for (int i = 30; i < 34; i++) {
			a[x][y] = i;
			y++;
		}
		x++;
		y = 0;
		for (int i = 40; i < 44; i++) {
			a[x][y] = i;
			y++;
		}
		x++;
		y = 0;
		for (int i = 50; i < 54; i++) {
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
