package controller;

public class Questao15 {

	/*
	 * Desenvolver um programa que apresente a série de Fibonacci até o décimo
	 * quinto termo. A série de Fibonacci é formada pela sequência
	 * 1,1,2,3,5,8,13,21,34, ... etc. Ela se caracteriza pela soma de um termo
	 * posterior com seu anterior subsequente.
	 */
	public static void main(String[] args) {

		int a = 1, b = 0, i = 0;
		System.out.println(b);
		System.out.println(a);

		while (i < 20) {

			a = a + b;
			b = a - b;
			i = i + 1;
			System.out.println(a);
		}
	}

}
