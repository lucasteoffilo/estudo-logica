package controller;

import util.Teclado;

public class OperadorLogicoE {

	public static void main(String[] args) {

		int num;
		num = Teclado.lerInt("Informe um n�mero.");
		if ((num >= 20) && (num <= 90)) {
			System.out.println("O n�mero est� entre 20 e 90.");
		} else {
			System.out.println("O n�mero n�o est� entre 20 e 90.");
		}
	}

}