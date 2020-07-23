package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que leia 10 nomes de pessoas e armazene no vetor
		 * nomes. Em seguida o programa deve informar que enquanto o usuário responder
		 * SIM, será pedido que ele digite um nome e o programa informará se este nome
		 * existe ou não no vetor nomes. Em resumo, o programa deverá fazer o seguinte:
		 * 
		 * • Solicitar 10 nomes para preencher o vetor nomes • Perguntar se o usuário
		 * quer fazer uma pesquisa de nomes no vetor nomes. • Se a resposta for SIM,
		 * perguntar qual o nome. • Informar se o nome existe ou não no vetor nomes.
		 */

		String nome[] = new String[5];

		for (int i = 0; i < nome.length; i++) {
			nome[i] = Teclado.lerTexto("Informe um nome.");
		}
		for (String a = "sim"; a.equals("sim");) {
			a = Teclado.lerTexto("Digite 'sim' para pesquisar um nome.");
			String b;
			if (a.equals("sim")) {
				b = Teclado.lerTexto("Qual nome ?");
				int aux = 0;
				for (int j = 0; j < nome.length; j++) {

					if (b.equals(nome[j])) {

						System.out.println("O nome está na posição " + j + " do vetor.");

						aux++;
					}

				}
				if (aux == 0) {
					System.out.println("O nome não foi encontrado no vetor.");

				}
			}

		}

	}

}
