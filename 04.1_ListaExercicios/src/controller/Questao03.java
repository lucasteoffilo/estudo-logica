package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {

		double num;
		num = Teclado.lerDouble("Informe um n�mero");
		// N�meros 'pares' - NUM / 2 = Resto 0
		if (num % 2 == 0) {
			System.out.println("O n�mero � par");
		} else {
			System.out.println("O n�mero � impar");
		}
	}

}
