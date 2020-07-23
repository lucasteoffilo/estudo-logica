package controller;

import util.Teclado;

public class Questao08 {

	/*
	 * Desenvolver um programa que pergunte 20 vezes o nome inteiro de uma pessoa,
	 * sexo e idade, e exiba o nome inteiro das pessoas que são do sexo masculino e
	 * possuem 21 anos ou mais.
	 */
	public static void main(String[] args) {

		String n, s;
		int a, i;
		for (a = 1; a <= 20; a++) {
			n = Teclado.lerTexto("Informe o nome completo: ");
			s = Teclado.lerTexto("Informe o sexo. 'M' para masculino e 'F' para feminino.");
			i = Teclado.lerInt("Informe a idade: ");
			if (s.equals("m") || s.equals("M") && i >= 21) {
				System.out.println(n);
			}
		}
	}

}
