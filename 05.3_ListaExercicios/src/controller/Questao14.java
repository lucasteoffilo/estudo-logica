package controller;

import util.Teclado;

public class Questao14 {
	/*
	 * Desenvolver um programa que pergunte nome, nota1 e nota2 de cada um dos 15
	 * alunos de uma turma. E exiba a listagem contendo nome, nota1, nota2, média e
	 * apresente “APROVADO” se a média for maior ou igual a 5, e “REPROVADO” se a
	 * média for menor que 5. Ao final, exibir também a média da turma.
	 */
	public static void main(String[] args) {

		double nota1, nota2, med, medturma = 0, i;
		String nome, sit;

		for (i = 0; i < 20; i++) {
			nome = Teclado.lerTexto("Nome do aluno: ");
			nota1 = Teclado.lerDouble("Nota 1: ");
			nota2 = Teclado.lerDouble("Nota 2: ");
			med = (nota1 + nota2) / 2;
			medturma = medturma + med;
			if (med >= 5) {
				sit = "APROVADO!";
			} else {
				sit = "REPROVADO!";
			}
			System.out.println(nome);
			System.out.println("Nota 1: " + nota1);
			System.out.println("Nota 2: " + nota2);
			System.out.println("Média: " + med);
			System.out.println(sit);

		}
		medturma = medturma / i;
		System.out.println("Média da turma: " + medturma);

	}

}
