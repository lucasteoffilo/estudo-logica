package controller;

import util.Teclado;

public class OperadorLogicoOu {

	public static void main(String[] args) {

		int num;
		num = Teclado.lerInt("Informe um número: ");
		if ((num < 20) || (num > 40)) {
			System.out.println("O número é menor que 20 ou maior que 40.");
		} else {
			System.out.println("O número está entre 20 e 40");
		}
	}

}
