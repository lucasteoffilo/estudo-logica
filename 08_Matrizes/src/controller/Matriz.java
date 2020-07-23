package controller;

import util.Teclado;

public class Matriz {
	public static void main(String[] args) {
		double notas[][] = new double[8][4];
		for (int linha = 0; linha < 8; linha++) {
			for (int col = 0; col < 4; col++) {
				notas[linha][col] = Teclado.lerDouble("Informe a nota " + col + " do aluno " + linha);
			}
		}
		System.out.println("Relatório de notas dos alunos:");
		for (int linha = 0; linha < 8; linha++) {
			for (int col = 0; col < 4; col++) {
				System.out.println("Aluno " + linha + " - Nota " + col + ":" + notas[linha][col]);
			}
		}
	}
}