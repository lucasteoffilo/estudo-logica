package controller;

public class Questao16 {

	public static void main(String[] args) {
		/*
		 * 16) Desenvolver um programa que gere um vetor vazio com 8 posições,
		 * preencha-o através de uma rotina de repetição (laço) com os valores abaixo e
		 * exiba-o: 60 59 58 57 56 55 54 53
		 */

		int a[] = new int[8];
		int aux = 0;

		for (int i = 60; i > 52; i = i - 1) {
			a[aux] = i;
			aux++;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
