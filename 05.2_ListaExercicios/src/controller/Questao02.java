package controller;

public class Questao02 {

	/*
	 * Desenvolver um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 0 at� 500. Utilize um la�o que varie de 2 em 2.
	 */
	public static void main(String[] args) {

		int i = 2, soma = i;

		do {
			soma = soma + i;
			i = i + 2;
		} while (i <= 500);
		System.out.println("A soma dos valores pares de 0 � 500 �: " + soma);
	}

}
