package controller;

public class Questao17 {

	public static void main(String[] args) {
		/*
		 * 17) Desenvolver um programa que gere um vetor vazio com 8 posições,
		 * preencha-o através de uma rotina de repetição (laço) com os valores abaixo e
		 * exiba-o: 2 4 8 16 32 64 128 256
		 */

		int a[] = new int[8];
		int aux = 0;

		for (int i = 2; i < 300;) {
			a[aux] = i;
			i = i * 2;
			aux++;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
