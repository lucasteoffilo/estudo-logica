package controller;

public class Questao25 {

	/*
	 * Chico tem 1,50m e cresce 2 cent�metros por ano, enquanto Juca tem 1,10m e
	 * cresce 3 cent�metros por ano. Construir um algoritmo que calcule e exiba na
	 * tela quantos anos ser�o necess�rios para que Juca seja mais alto que Chico.
	 */
	public static void main(String[] args) {

		double c = 1.5, j = 1.1;
		int i = 0;

		for (j = 1.1; j <= c; i++) {

			j = j + 0.03;
			c = c + 0.02;
		}
		System.out.println("Levarão " + i + " anos at� que Juca seja mais alto que Chico.");
		System.out.println("Juca: " + j + " m.");
		System.out.println("Chico: " + c + " m.");

	}

}
