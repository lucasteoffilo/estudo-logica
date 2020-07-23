package controller;

public class Questao18 {

	/*
	 * 18. Fazer um algoritmo que exiba o valor da soma dos números que existem no
	 * intervalo de 0 a 50.
	 */
	public static void main(String[] args) {
		
		int i, soma = 0;
		
		for (i = 0; i <= 50; i++) {
			soma = soma + i;
		}
		System.out.println("Soma de 0 a 50 = " + soma);
	}

}
