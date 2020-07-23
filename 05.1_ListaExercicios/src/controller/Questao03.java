package controller;

public class Questao03 {

	/*
	 * Desenvolver um programa que apresente os quadrados dos números inteiros de 15
	 * a 200.
	 */
	public static void main(String[] args) {

		int a;
		a = 15;

		while (a <= 200) {
			System.out.println("O quadrado de " + a + " �: " + Math.pow(a, 2));
			a = a + 1;
		}
	}

}
