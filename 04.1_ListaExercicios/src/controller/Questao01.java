package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {

		int num;
		num = Teclado.lerInt("Informe um n�mero: ");
		if (num >= 20) {
			System.out.println("A metade de " + num + " �: " + num / 2);
		} else {
			System.out.println("O n�mero informado foi: " + num);
		}
	}

}
