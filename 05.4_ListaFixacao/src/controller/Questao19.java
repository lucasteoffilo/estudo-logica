package controller;

public class Questao19 {

	/*
	 * Fazer um algoritmo que exiba o valor da soma dos números pares que existem no
	 * intervalo de 0 a 50.
	 */
	public static void main(String[] args) {

		int soma = 0, i;
		for (i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
			}
		}
		System.out.println("O valor da soma dos números pares de 0 a 50 = " + soma);
	}

}
