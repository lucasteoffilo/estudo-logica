package controller;

import util.Teclado;

public class Questao01 {
	/*
	 * Fazer um algoritmo que leia o numerador e o denominador de uma fração, e
	 * informe como resposta o número decimal correspondente a esta fração.
	 */
	public static void main(String[] args) {

		double num, den;
	
	num = Teclado.lerDouble("Informe o númerador da fração.");
	den = Teclado.lerDouble("Informe o denominador da fração.");
	
	System.out.println("O decimal correspondente a fração é: " + num/den);
	}
}
