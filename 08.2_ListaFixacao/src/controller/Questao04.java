package controller;

import util.Teclado;

public class Questao04 {

	/*
	 * Desenvolver um programa que exiba o cardápio da lanchonete. Em seguida peça
	 * ao usuário o código do item desejado e a quantidade deste item. Ao final
	 * deverá ser exibido na tela o valor a ser pago por aquele lanche. Considere
	 * que a cada execução o cliente só possa escolher um código do cardápio.
	 */
	public static void main(String[] args) {

		System.out.println("Código   -   Especificação   -   Preço");
		System.out.println("  1      -  Cachorro Quente  -   R$2,20");
		System.out.println("  2      -  Bauru Simples    -   R$3,30");
		System.out.println("  3      -  Bauru com Ovo    -   R$3,50");
		System.out.println("  4      -  Hambúrger        -   R$2,50");
		System.out.println("  5      -  Cheeseburguer    -   R$2,80");
		System.out.println("  6      -  Refrigerante     -   R$3,50");

		int a, b;

		a = Teclado.lerInt("Informe o código do item.");
		b = Teclado.lerInt("Informe a quantidade deste item.");

		switch (a) {

		case 1:
			System.out.println("Valor a ser pago: R$" + (2.20 * b));
			break;
		case 2:
			System.out.println("Valor a ser pago: R$" + (3.30 * b));
			break;
		case 3:
			System.out.println("Valor a ser pago: R$" + (3.50 * b));
			break;
		case 4:
			System.out.println("Valor a ser pago: R$" + (2.50 * b));
			break;
		case 5:
			System.out.println("Valor a ser pago: R$" + (2.80 * b));
			break;
		case 6:
			System.out.println("Valor a ser pago: R$" + (3.50 * b));
			break;
		default:
			System.out.println("Código informado inválido.");

		}

	}

}
