package controller;

import util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que armazene nome e salário de 20 pessoas, calcule e
		 * armazene o novo salário sabendo-se que houve um reajuste de 8%. Exibir uma
		 * listagem numerada com nome e novo salário.
		 */

		String nome[] = new String[20];
		double sal[] = new double[20];

		for (int i = 0; i < 20; i++) {
			nome[i] = Teclado.lerTexto("Informe o nome.");
			sal[i] = Teclado.lerDouble("Informe o salário.");
			sal[i] = sal[i] * 1.08;
		}
		for (int i = 0; i < 20; i++) {
			System.out.println(nome[i] + "\nSalário reajustado em 8%: " + sal[i]);
		}
	}

}
