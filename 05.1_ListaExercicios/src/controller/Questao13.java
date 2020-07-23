package controller;

public class Questao13 {

	/*
	 * Desenvolver um programa que imprima a tabuada de 3 a 6.
	 */
	public static void main(String[] args) {

		int i = 0, n = 3;

		while (n <= 6) {

			while (i <= 10) {
				System.out.println(n + " x " + i + " = " + (n * i));
				i = i + 1;

			}
			i = 0;
			n++;
		}
	}

}
