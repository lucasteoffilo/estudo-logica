package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {

		int num1, num2;
		num1 = Teclado.lerInt("Informe um n�mero.");
		num2 = Teclado.lerInt("Informe outro n�mero.");
		if (num1 > num2) {
			System.out.println("A diferen�a entre " + num1 + " e " + num2 + " � :" + (num1 - num2));
		} else {
			System.out.println("A diferen�a entre " + num2 + " e " + num1 + " � : " + (num2 - num1));
		}
	}

}
