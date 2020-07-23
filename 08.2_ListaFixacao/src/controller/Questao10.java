package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte ao usuário os valores para preencher 2
		 * vetores a e b com 20 números cada, construa um vetor c, em que cada elemento
		 * de c é a subtração do elemento correspondente de a com b. Apresentar ao final
		 * os vetores a, b e c.
		 */

		double a[] = new double[20];
		double b[] = new double[20];
		double c[] = new double[20];

		for (int i = 0; i < a.length; i++) {
			a[i] = Teclado.lerDouble("Informe um número.");
			b[i] = Teclado.lerDouble("Informe outro número.");
			c[i] = a[i] - b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(a[i] + " - " + b[i] + " = " + c[i]);
		}
	}

}
