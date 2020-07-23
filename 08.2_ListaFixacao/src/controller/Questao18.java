package controller;

public class Questao18 {

	public static void main(String[] args) {
		/*
		 * 18) Desenvolva um programa que gere uma matriz 3 x 4 vazia, preencha-a
		 * através de rotinas de repetição (laços) com os valores abaixo e exiba-a: 51
		 * 52 53 54 55 56 57 58 59 60 61 62
		 */

		int a[][] = new int[3][4];
		int x = 0, y = 0;
		for (int i = 51; i < 55; i++) {
			a[x][y] = i;
			y++;
		}
		x = 1;
		y = 0;
		for (int i = 55; i < 59; i++) {
			a[x][y] = i;
			y++;
		}
		x = 2;
		y = 0;
		for (int i = 59; i < 63; i++) {
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
