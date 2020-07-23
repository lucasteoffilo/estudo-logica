package controller;

public class Questao15 {

	public static void main(String[] args) {
		/*
		 * 15) Desenvolver um programa que gere um vetor vazio com 8 posições,
		 * preencha-o através de uma rotina de repetição (laço com incremento de um em
		 * um) com os valores abaixo e exiba-o: 20 25 30 35 40 45 50 55
		 */

		int a[] = new int[8];
		int aux = 0;
		for (int i = 20; i < 60; i = i + 5) {
			a[aux] = i;
			aux++;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
