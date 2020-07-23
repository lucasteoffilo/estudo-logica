package controller;

import util.Teclado;

public class Questao24 {

	/*
	 * Fazer um algoritmo que pe�a ao usu�rio para digitar n�meros positivos, de
	 * forma que s� pare de pedir isso ao usu�rio quando este inserir um n�mero
	 * negativo. Ao final, dever� ser exibido quantos n�meros positivos foram
	 * inseridos.
	 */
	public static void main(String[] args) {

		int i, soma = 0;

		for (i = 0; i >= 0;) {
			i = Teclado.lerInt("Informe um número positivo. Para interromper o programa digite um número negativo.");
			if (i >= 0) {
				soma++;
			}

		}
		System.out.println("Foram inseridos " + soma + " números positivos.");

	}

}
