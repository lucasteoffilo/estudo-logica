package controller;

import util.Teclado;

public class Exercicio01 {

	/*
	 * Fa�a um programa em Java que calcule e exiba o valor do desconto e o valor a
	 * ser pago pelo cliente de v�rios carros. O desconto dever� ser calculado de
	 * acordo com o ano do ve�culo. At� 2000 desconto de 12% e acima de 2000
	 * desconto de 7%. O sistema dever� perguntar se deseja continuar calculando
	 * novos descontos at� que a resposta seja: "( N ) N�o )".
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

			System.out.println("O valor do desconto �: R$" + valDesconto + " e o valor a ser pago �: R$" + valFinal);
			p = Teclado.lerTexto("Deseja continua calculando? Digite 'S' para sim e 'N' para n�o.");

		} while (!p.equals("N"));
	}
}
