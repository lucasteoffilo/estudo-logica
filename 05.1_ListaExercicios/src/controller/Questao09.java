package controller;

public class Questao09 {

	/*
	 * 1) Elaborar um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 0 at� 500. Utilize um la�o que efetue a varia��o de 2
	 * em 2.
	 */
	public static void main(String[] args) {

		int i = 2;

		while (i <= 500) {
			System.out.println(i + " + " + i + " = " + (i + i));
			i = i + 2;
		}

	}

}
