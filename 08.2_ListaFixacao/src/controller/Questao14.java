package controller;

public class Questao14 {

	public static void main(String[] args) {
		/*
		 * 14) Desenvolver um programa que gere um vetor vazio com 8 posições,
		 * preencha-o através de uma rotina de repetição (laço) com os valores abaixo e
		 * exiba-o: 15 16 17 18 19 20 21 22
		 */

		int a[] = new int[8];
		int aux = 0;
		for (int i = 15; i < 23; i++) {
			a[aux] = i;
			aux++;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
