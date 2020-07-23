package controller;

import util.Teclado;

public class Questao21 {

	/*
	 * Fazer um algoritmo que pergunte a idade de 10 pessoas, e ao final, informe
	 * quantas destas pessoas são menores de idade.
	 */
	public static void main(String[] args) {

		int id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, soma = 0;
		
		id1 = Teclado.lerInt("Informe a idade de uma pessoa.");
		id2 = Teclado.lerInt("Informe a idade de outra pessoa.");
		id3 = Teclado.lerInt("Informe a idade de outra pessoa.");
		id4 = Teclado.lerInt("Informe a idade de outra pessoa.");
		id5 = Teclado.lerInt("Informe a idade de outra pessoa.");
		id6 = Teclado.lerInt("Informe a idade de outra pessoa.");
		id7 = Teclado.lerInt("Informe a idade de outra pessoa.");
		id8 = Teclado.lerInt("Informe a idade de outra pessoa.");
		id9 = Teclado.lerInt("Informe a idade de outra pessoa.");
		id10 = Teclado.lerInt("Informe a idade de outra pessoa.");
		
		if (id1 < 18) {
			soma++;
		}
		if (id2 < 18) {
			soma++;
		}
		if (id3 < 18) {
			soma++;
		}
		if (id4 < 18) {
			soma++;
		}
		if (id5 < 18) {
			soma++;
		}
		if (id6 < 18) {
			soma++;
		}
		if (id7 < 18) {
			soma++;
		}
		if (id8 < 18) {
			soma++;
		}
		if (id9 < 18) {
			soma++;
		}
		if (id10 < 18) {
			soma++;
		}
		System.out.println(soma + " pessoas são menores de idade.");
	}
	

}
