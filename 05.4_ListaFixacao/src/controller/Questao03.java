package controller;

import util.Teclado;

public class Questao03 {

	/*
	 * Fazer um algoritmo que pergunte um valor e exiba como resposta este valor com
	 * acréscimo de 18% e também o mesmo valor inicial com desconto de 65%.
	 */
	public static void main(String[] args) {

		double v;
		
		v = Teclado.lerDouble("Informe o valor a ser calculado.");
		
		System.out.println("R$" + v + " + 18% = R$" + (v*1.18));
		System.out.println("R$" + v + " - 65% = R$" + (v*0.35));
	}

}
