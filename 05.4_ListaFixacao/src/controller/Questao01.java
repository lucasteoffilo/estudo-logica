package controller;

import util.Teclado;

public class Questao01 {
	/*
	 * Fazer um algoritmo que leia o numerador e o denominador de uma fra��o, e
	 * informe como resposta o n�mero decimal correspondente a esta fra��o.
	 */
	public static void main(String[] args) {

		double num, den;
	
	num = Teclado.lerDouble("Informe o n�merador da fra��o.");
	den = Teclado.lerDouble("Informe o denominador da fra��o.");
	
	System.out.println("O decimal correspondente a fra��o �: " + num/den);
	}
}
