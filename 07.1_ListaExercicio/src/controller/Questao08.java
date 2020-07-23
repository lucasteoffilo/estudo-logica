package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {

		/*
		 * Desenvolver um programa que armazene nome e nota das PR1 e PR2 de 15 alunos,
		 * calcule e armazene a média, armazene também a situação do aluno (AP ou RP).
		 * Exibir ao final uma listagem contendo nomes, notas, médias e situação de cada
		 * aluno.
		 */

		String nome[] = new String[15];
		String sit[] = new String[15];
		double PR1[] = new double[15];
		double PR2[] = new double[15];
		double med[] = new double[15];

		for (int i = 0; i < 15; i++) {

			nome[i] = Teclado.lerTexto("Informe o nome do aluno.");
			PR1[i] = Teclado.lerDouble("Informe a nota da prova 1.");
			PR2[i] = Teclado.lerDouble("Informe a nota da prova 2.");
			med[i] = (PR1[i] + PR2[i]) / 2;

			if (med[i] > 6) {
				sit[i] = "AP";
				break;
			} else {
				sit[i] = "RP";

			}

		}
		for (int i = 0; i < 15; i++) {
			System.out.println(nome[i] + "\nMédia: " + med[i] + "\nSituação: " + sit[i]);

		}

	}
}
