package controller;

public class Questao12 {
	/*
	 * Agora faça uma alteração para que sejam apresentados somente os itens acima
	 * da diagonal principal da matriz anterior. No lugar que não é para exibir a
	 * triangulação, deverá aparecer x-x.
	 */
	public static void main(String[] args) {

		int a, b;

		System.out.println("Triangulação de matriz de ordem 10");

		for (a = 1; a <= 10; a++) {

			for (b = 1; b <= 10; b++) {
				if (b <= a) {
					System.out.println("x-x");
				} else {
					System.out.println(a + "-" + b);
				}

			}

		}
	}

}
