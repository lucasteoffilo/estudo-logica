package controller;

public class Questao06 {

	/*
	 * Desenvolver um programa que apresente os quadrados dos n�meros inteiros de 2
	 * a 50.
	 */
	public static void main(String[] args) {

		double i = 2;
		do {
			System.out.println("O quadrado de " + i + " �: " + Math.pow(i,2));
			i++;
		} while (i <= 50);
	}

}
