package controller;

import util.Teclado;

public class Questao11 {

	/*
	 * Fazer um algoritmo que pergunte o ano de nascimento de uma pessoa e o ano
	 * atual. Ao final o algoritmo dever� exibir na tela a idade da pessoa. Por�m,
	 * se o usu�rio inserir o ano de nascimento com valor maior que o ano atual, o
	 * c�lculo de idade n�o dever� ser feito, e ent�o dever� surgir a seguinte
	 * mensagem na tela: �Dados inseridos est�o incorretos�.
	 */
	public static void main(String[] args) {
		int a, b;

		a = Teclado.lerInt("Informe o ano de nascimento.");
		b = Teclado.lerInt("Informe o ano atual.");

		if (!(a > b)) {
			System.out.println(b - a + " anos.");
		} else {
			System.out.println("Os dados inseridos est�o incorretos");
		}
	}

}
