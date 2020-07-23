package controller;

public class Questao09 {

	/*
	 * Desenvolver um programa que apresente a série de Fibonacci até o décimo
	 * quinto termo. A série de Fibonacci é formada pela sequência
	 * 1,1,2,3,5,8,13,21,34, ... etc. Essa série se caracteriza pela soma de um
	 * termo posterior com o seu anterior subsequente.
	 */
	public static void main(String[] args) {

		int a = 1, s = 0, i = 0;
		System.out.println(a);
		do {
			a = a + s;
			s = a - s;
			i++;
			System.out.println(a);
		} while (i <= 13);
	}

}
