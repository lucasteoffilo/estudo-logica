package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {

		/*
		 * 2) Desenvolver um programa que pergunte ao usuário um número, e apresente
		 * como resposta se o referido número é múltiplo de 10. Fazer obrigatoriamente
		 * com programação com múltipla escolha.
		 */

		int a;

		a = Teclado.lerInt("Informe um número.");

		switch (a % 10) {
		case 0:
			System.out.println("O número informado é multiplo de 10.");
			break;
		default:
			System.out.println("O número informado não é multiplo de 10.");
		}
	}

}
