package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		int num1, num2;
		num1 = Teclado.lerInt("Informe um n�mero.");
		num2 = Teclado.lerInt("Informe outro n�mero.");
		if (num1 % num2 == 0) {
			System.out.println(num2 + " � um divisor de " + num1);
		} else {
			System.out.println(num2 + " n�o � um divisor de " + num1);
		}
	}

}
