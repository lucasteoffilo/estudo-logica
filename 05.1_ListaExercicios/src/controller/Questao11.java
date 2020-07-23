package controller;

import util.Teclado;

/*
 * Elaborar um programa que apresente o valor de uma potência de uma base qualquer (Variável b) elevada a um expoente qualquer (Variável e), ou seja, de be. (Sem usar Math.pow();)
 * 
 */

public class Questao11 {

	public static void main(String[] args) {

		int b = 1, e = 1, i = 1, aux = b;

		b = Teclado.lerInt("Informe a base da pot�ncia: ");
		e = Teclado.lerInt("Informe o expoente da pot�ncia: ");
		while (i <= e) {
			aux = aux * b;
			i++;
		}
		System.out.println("A pot�ncia de " + b + " elevado a " + e + " � : " + aux);
		System.out.println("Questao12 da Verdade: " + Math.pow(b, e)); // Verifica se o resultado est� correto

	}

}
