package controller;

public class Questao01 {

	/*
	 * Desenvolver um programa que apresente todos os valores num�ricos inteiros
	 * pares situados na faixa de 100 a 200.
	 */
	public static void main(String[] args) {

		int i = 100;

		do {
			if (i % 2 == 0) {
				System.out.println(i + " � um n�mero par na faixa de 100 a 200.");
				i++;
			} else {
				i++;
			}
		} while (i <= 200);
	}

}
