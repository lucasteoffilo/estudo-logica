package controller;

import util.Teclado;

public class Questao11 {

	/*
	 * Fazer um algoritmo que pergunte o ano de nascimento de uma pessoa e o ano
	 * atual. Ao final o algoritmo deverá exibir na tela a idade da pessoa. Porém,
	 * se o usuário inserir o ano de nascimento com valor maior que o ano atual, o
	 * cálculo de idade não deverá ser feito, e então deverá surgir a seguinte
	 * mensagem na tela: “Dados inseridos estão incorretos”.
	 */
	public static void main(String[] args) {
		int a, b;

		a = Teclado.lerInt("Informe o ano de nascimento.");
		b = Teclado.lerInt("Informe o ano atual.");

		if (!(a > b)) {
			System.out.println(b - a + " anos.");
		} else {
			System.out.println("Os dados inseridos estão incorretos");
		}
	}

}
