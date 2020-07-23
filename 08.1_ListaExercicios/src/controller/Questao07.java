package controller;

public class Questao07 {

	public static void main(String[] args) {
		/*
		 * 7) Desenvolva um programa que gere e exiba a matriz abaixo: 11 12 13 14 15 16
		 * 17 18 19 20 21 22
		 */

		int a[][] = new int[3][4];
		int num = 11;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = num;
				num++;

			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
