package controller;

import util.Teclado;

public class Questao02 {

	/*
	 * Desenvolver um programa que apresente o total da soma de n números inteiros
	 * do número 1 até n, onde n é um valor informado pelo usuário.
	 */
	public static void main(String[] args) {

		int a, b, soma;
		String c = "S";

		for (; c.equals("S") || c.equals("s");) {
			b = 0;
			soma = 0;
			a = Teclado.lerInt("Informe um número.");
			for (; b <= a; b++) {
				soma = soma + b;
			}
			System.out.println(soma);
			c = Teclado.lerTexto("Deseja continuar ? 'S' para sim e 'N' para não.");
		}

	}

}
