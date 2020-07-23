package controller;

import util.Teclado;

public class Questao05 {

	/*
	 * Modifique a questão 04, de forma que o usuário possa digitar códigos e
	 * quantidades até que em algum momento ele insira o código 0 (zero) para
	 * encerrar o seu pedido. O programa então deverá exibir o valor a ser pago para
	 * todo o pedido do usuário.
	 */
	public static void main(String[] args) {

		System.out.println("Código   -   Especificação   -   Preço");
		System.out.println("  1      -  Cachorro Quente  -   R$2,20");
		System.out.println("  2      -  Bauru Simples    -   R$3,30");
		System.out.println("  3      -  Bauru com Ovo    -   R$3,50");
		System.out.println("  4      -  Hambúrger        -   R$2,50");
		System.out.println("  5      -  Cheeseburguer    -   R$2,80");
		System.out.println("  6      -  Refrigerante     -   R$3,50");

		int a = 1, b = 1;
		double soma = 0;
		for (; !(a == 0) || !(b == 0);) {
			a = Teclado.lerInt("Informe o código do item.");
			if (a == 0) {
				break;
			}
			b = Teclado.lerInt("Informe a quantidade deste item ou pressione 0 para encerrar.");
			if (b == 0) {
				break;
			}
			switch (a) {

			case 1:
				soma = soma + (2.20 * b);
				break;
			case 2:
				soma = soma + (3.30 * b);
				break;
			case 3:
				soma = soma + (3.50 * b);
				break;
			case 4:
				soma = soma + (2.50 * b);
				break;
			case 5:
				soma = soma + (2.80 * b);
				break;
			case 6:
				soma = soma + (3.50 * b);
				break;
			default:
				System.out.println("Código informado inválido.");

			}

		}
		System.out.println("Valor total do pedido: R$" + soma);

	}
}