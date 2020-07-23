package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {

		/*
		 * Crie 2 vetores chamados nome e profissao, cada um com 5 elementos. Pergunte
		 * ao usuário o nome e a profissão de 5 pessoas e preencha estes vetores. Ao
		 * final exiba um relatório apontando o nome e a profissão de cada uma das 5
		 * pessoas cadastradas.
		 */

		String nome[] = new String[5];
		String prof[] = new String[5];

		for (int i = 0; i < 5; i++) {
			nome[i] = Teclado.lerTexto("Informe o nome.");
			prof[i] = Teclado.lerTexto("Informe a profissão.");
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Nome:" + nome[i] + "\nProfissão: " + prof[i] + "\n");

		}

	}

}
