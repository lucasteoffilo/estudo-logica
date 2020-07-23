package controller;

import util.Teclado;

public class Questao06 {

	/*
	 * Desenvolver um programa que apresente o valor de uma potência de uma base
	 * qualquer elevada a um expoente qualquer, ou seja, de be, onde os valores de b
	 * e e são fornecidos pelo usuário, sem utilizar Math.pow().
	 * 
	 */
	public static void main(String[] args) {

		double b, e, i, p;
		String c = "s";

		for (; c.equals("s") || c.equals("S");) {
			b = Teclado.lerDouble("Informe o valor da base.");
			e = Teclado.lerDouble("Informe o valor do expoente.");
			p = 1;
			for (i = 1; i <= e; i++) {
				p = p * b;
			}
			System.out.println("Potência: " + p);
			System.out.println(i);
			c = Teclado.lerTexto("Deseja continuar? 'S' para sim e 'N' para não.");
		}
	}

}
