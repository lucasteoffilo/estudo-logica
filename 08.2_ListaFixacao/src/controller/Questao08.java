package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que armazene 5 nomes de pessoas em um vetor, e depois
		 * pergunte um nome, e se for encontrado, exibir a posição desse nome no vetor,
		 * caso contrário, exibir uma mensagem informando que o nome não está
		 * cadastrado.
		 */
		String nome[] = new String[5];

		for (int i = 0; i < nome.length; i++) {
			nome[i] = Teclado.lerTexto("Informe um nome de uma pessoa.");
		}
		String a = Teclado.lerTexto("Informe um nome para consultar.");
		int aux = 0;
		for (int i = 0; i < nome.length; i++) {
			if (a.equals(nome[i])) {
				System.out.println("O nome está na posição " + i + " do vetor.");
				aux++;
			}
		}
		if (aux == 0) {
			System.out.println("O nome não está cadastrado.");
		}
	}
}
