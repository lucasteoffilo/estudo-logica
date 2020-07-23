package controller;

import util.Teclado;

public class Questao12 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte ao usuário os valores de um vetor a com
		 * 15 elementos inteiros. Construir um vetor b de mesmo tipo e com os mesmos
		 * valores de a, sendo que o vetor b deve ser ordenado de forma decrescente.
		 */

		int a[] = new int[15];
		int b[] = new int[15];

		for (int i = 0; i < a.length; i++) {
			a[i] = Teclado.lerInt("Informe um número.");
			b[i] = a[i];
		}
		for (int i = 1; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (b[i] > b[j]) {
					int aux = b[i];
					b[i] = b[j];
					b[j] = aux;

				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i] + " - " + b[i]);
		}

	}

}
