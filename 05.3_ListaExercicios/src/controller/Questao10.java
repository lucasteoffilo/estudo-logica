package controller;

import util.Teclado;

public class Questao10 {

	/*
	 * Desenvolver um programa que apresente o fatorial de um número informado pelo
	 * usuário.
	 */
	public static void main(String[] args) {

		int a, i, aux;
		a = Teclado.lerInt("Informe o número do fator.");
		aux = a;
		for (i = a - 1; i > 0; i = i - 1) {
			a = a * i;
		}
		System.out.println("Fatorial " + aux + "! = " + a);

	}

}
