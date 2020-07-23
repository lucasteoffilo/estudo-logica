package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {

		/*
		 * Desenvolver um programa que armazene 5 nomes de pessoas em um vetor, e depois
		 * pergunte um número que corresponda a uma pessoa e exiba este nome, ou então
		 * exiba a informação de que o número não corresponde a uma pessoa cadastrada.
		 */

		String nome[] = new String[6];

		for (int i = 1; i < nome.length; i++) {
			nome[i] = Teclado.lerTexto("Informe um nome.");
		}
		int a = Teclado.lerInt("Informe um número para consultar um nome.");
		if (a > 0 && a < 6) {
			System.out.println(nome[a]);
		} else {
			System.out.println("O número não corresponde a uma pessoa cadastrada.");
		}

	}

}
