package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {

		String capital;
		capital = Teclado.lerTexto("Informe qual � a capital do Brasil.");
		if ((capital.equals("Brasilia") || capital.equals("Bras�lia") || capital.equals("brasilia")
				|| capital.equals("bras�lia"))) {
			System.out.println("Parab�ns! Voc� acertou.");
		} else {
			System.out.println("Voc� errou.");
		}
	}

}
