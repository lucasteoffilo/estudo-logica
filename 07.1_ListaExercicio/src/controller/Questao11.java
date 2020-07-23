package controller;

import util.Teclado;

public class Questao11 {

	public static void main(String[] args) {

		/*
		 * Crie um vetor a com 10 elementos e pergunte ao usuário 10 números para
		 * preencher este vetor. Ao final, apresente o maior e o menor valor informados,
		 * além da média dos 10 números informados.
		 */

		double a[] = new double[10];
		double soma = 0;
		double maior, menor;

		for (int i = 0; i < 10; i++) {
			a[i] = Teclado.lerDouble("Informe um número.");
			soma = (soma + a[i]);

		}
		maior = 0;
		menor = 0;
		for (int i = 0; i < 10; i++) {
			if (a[i] > maior) {
				maior = a[i];
			} else {
				menor = maior;
				if (a[i] < menor) {
					menor = a[i];
				}
			}

		}
		System.out.println("Maior número: " + maior + "\nMenor número: " + menor + "\nMédia dos números: " + soma / 10);

	}

}
