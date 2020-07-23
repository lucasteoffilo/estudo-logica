package controller;

import util.Teclado;

public class Exercicio01 {

	/*
	 * Faça um programa em Java que calcule e exiba o valor do desconto e o valor a
	 * ser pago pelo cliente de vários carros. O desconto deverá ser calculado de
	 * acordo com o ano do veículo. Até 2000 desconto de 12% e acima de 2000
	 * desconto de 7%. O sistema deverá perguntar se deseja continuar calculando
	 * novos descontos até que a resposta seja: "( N ) Não )".
	 */

	public static void main(String[] args) {

		double valDesconto, desconto = 0, valV, valFinal;
		int anoV;
		String p = "S";
		do {

			valV = Teclado.lerDouble("Qual o valor do carro? ");
			anoV = Teclado.lerInt("Qual o ano do carro? ");

			if (anoV <= 2000) {
				desconto = 0.12;
			} else {
				desconto = 0.07;
			}
			valDesconto = (valV * desconto);
			valFinal = valV - valDesconto;

			System.out.println("O valor do desconto é: R$" + valDesconto + " e o valor a ser pago é: R$" + valFinal);
			p = Teclado.lerTexto("Deseja continua calculando? Digite 'S' para sim e 'N' para não.");

		} while (!p.equals("N"));
	}
}
