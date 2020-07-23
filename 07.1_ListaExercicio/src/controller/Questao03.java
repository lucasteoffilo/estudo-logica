package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {

		/*
		 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
		 * apresente a soma de todos os elementos que sejam ímpares.
		 * 
		 */

		double a[] = new double[5];
		double soma = 0;

		for (int i = 0; i < 5; i++) {
			a[i] = Teclado.lerDouble("Informe um valor.");
			if (!(a[i] % 2 == 0)) {
				soma = soma + a[i];
			}
		}
		System.out.println("A soma de todos os valores ímpares é = " + soma);
	}

}
