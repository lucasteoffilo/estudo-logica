package controller;

public abstract class Questao17 {

	/*
	 * 17. Fazer um algoritmo que exiba os números múltiplos de 5 que existem no
	 * intervalo de 0 a 50.
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0) {
				System.out.println("São múltiplos de 5: " + i);
			}
		}
	}

}
