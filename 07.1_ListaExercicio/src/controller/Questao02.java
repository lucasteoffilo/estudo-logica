package controller;

import util.Teclado;

public class Questao02 {

	/*
	 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
	 * apresente a soma de todos os elementos deste vetor.
	 */
	public static void main(String[] args) {

		double a[] = new double[5];
		double soma = 0;

		for (int i = 0; i < 5; i++) {
			a[i] = Teclado.lerDouble("Informe um valor.");
			soma = soma + a[i];
		}
		System.out.println("A soma dos valores de todos os valores é = " + soma);
	}

}
