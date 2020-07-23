package controller;

public class Questao22 {

	public static void main(String[] args) {
		/*
		 * 22) Desenvolva um programa que gere uma matriz 3 x 4 vazia, preencha-a
		 * através de rotinas de repetição (laços) com os valores abaixo e exiba-a: 10
		 * 13 16 19 11 14 17 20 12 15 18 21
		 */

		int a[][] = new int[3][4];
		int x = 0, y = 0;
		for (int i = 10; i < 20; i = i + 3) {
			a[x][y] = i;
			y++;
		}
		x++;
		y = 0;
		for (int i = 11; i < 21; i = i + 3) {
			a[x][y] = i;
			y++;
		}
		x++;
		y = 0;
		for (int i = 12; i < 22; i = i + 3) {
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
