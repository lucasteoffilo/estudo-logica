package controller;

import util.Teclado;

public class Questao15 {

	/*
	 * Desenvolver um programa que pergunte o nome e o salário bruto de 10 pessoas,
	 * e exiba nome, valor da alíquota do imposto de renda, e o salário já com o
	 * desconto realizado, sabendo-se que:
	 */
	public static void main(String[] args) {

		double sal, aliq, aux;
		String nome;

		for (int i = 1; i <= 10; i++) {
			nome = Teclado.lerTexto("Informe o nome.");
			sal = Teclado.lerDouble("Informe o salário.");
			aliq = 1;
			if (sal < 600) {
				aux = 0;
				aliq = aliq - aux;
			} else {
				if (sal >= 600 && sal <= 1499.99) {
					aux = 0.10;
					aliq = aliq - aux;
				} else {
					aux = 0.15;
					aliq = aliq - aux;
				}
			}
			System.out.println(nome + " seu salário com desconto do Imposto de Renda aplicado é: R$" + sal * aliq);
			System.out.println("Base de calcúlo da alíquota de " + aux + "%");
		}

	}

}
