package controller;

public class Questao20 {

	/*
	 * Fazer um algoritmo que exiba o valor da soma dos números múltiplos de 5 que
	 * existem no intervalo de 0 a 50.
	 */
	public static void main(String[] args) {
		
		int soma = 0;
		for (int i = 0; i <= 50; i++) {
			if (i%5==0) {
				soma = soma + i;
			}
		}
		System.out.println("A soma dos múltiplos de 5 de 0 a 50 = " + soma);

	}

}
