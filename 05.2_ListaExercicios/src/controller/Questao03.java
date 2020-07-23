package controller;

public class Questao03 {

	/*
	 * Desenvolver um programa que apresente o total da soma dos cinco primeiros
	 * números inteiros
	 */
	public static void main(String[] args) {

		int i = 1, soma = 0;

		do {
			soma = soma + i;
			i++;
		} while (i <= 5);
		System.out.println("A soma dos cinco primeiros números inteiros é: " + soma);
	}

}
