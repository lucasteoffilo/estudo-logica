package controller;

import util.Teclado;

public class Questao10 {

	/*
	 * Fazer um algoritmo que pergunte o nome de um estado brasileiro, e ao final,
	 * informe na tela se o estado inserido est� ou n�o na regi�o Sudeste.
	 */
	public static void main(String[] args) {

		String a;
		a = Teclado.lerTexto("Informe a sigla de um estado brasileiro.");

		if ((a.equals("RJ") || a.equals("ES") || a.equals("SP") || a.equals("MG"))) {
			System.out.println("O estado pertence a regi�o sudeste.");
		} else {
			System.out.println("O estado n�o pertence a regi�o sudeste");
		}
	}

}
