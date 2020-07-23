package controller;

public class Questao04 {

	public static void main(String[] args) {

		/*
		 * Desenvolver um programa que apresente o valor da soma dos cem primeiros
		 * números inteiros (1 + 2 + 3 + 4 + ... + 97 + 98 + 99 + 100)
		 */
		int a, soma;
		a = 1;
		soma = 0;
		while (a <= 100) {
			a = a + 1;
			soma = soma + a;
		}
		System.out.println("A soma dos cem primeiros números inteiros é: " + soma);
	}

}
