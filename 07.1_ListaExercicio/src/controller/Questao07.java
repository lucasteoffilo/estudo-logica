package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {

		/*
		 * Crie um vetor chamado semana com 7 elementos já contendo todos os nomes por
		 * extenso dos dias da semana. Em seguida pergunte ao usuário um número e
		 * apresente o dia correspondente ao número no vetor, ou exiba a mensagem
		 * “Número não corresponde a um dia da semana.”
		 */

		String semana[] = { "", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado",
				"Domingo" };
		int a;

		a = Teclado.lerInt("Informe um número.");
		if (a > 0 && a < 8) {
			System.out.println(semana[a]);
		} else {
			System.out.println("Número não corresponde a um dia da semana.");
		}

	}

}
