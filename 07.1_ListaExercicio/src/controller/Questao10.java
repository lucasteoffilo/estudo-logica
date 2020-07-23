package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {

		/*
		 * Crie 3 vetores (nomes, telefones, endereços) e pergunte ao usuário o nome,
		 * telefone e endereço de 5 pessoas. Em seguida peça ao usuário para digitar um
		 * número de 1 a 5, e exibir como resposta os dados da pessoa cadastrada no
		 * número informado.
		 */

		String nome[] = new String[5];
		String end[] = new String[5];
		String tel[] = new String[5];

		for (int i = 0; i < 5; i++) {
			nome[i] = Teclado.lerTexto("Informe o nome.");
			tel[i] = Teclado.lerTexto("Informe o telefone.");
			end[i] = Teclado.lerTexto("Informe o endereço.");
		}
		int a = Teclado.lerInt("Informe um número de 1 a 5.");
		if (a > 0 && a < 6) {
			a = a - 1;
			for (int i = 0; i < 5; i++) {
				if (a == i) {
					System.out.println("Nome: " + nome[i] + "\n" + "Telefone: " + tel[i] + "\nEndereço: " + end[i]);

				}
			}
		}

	}
}
