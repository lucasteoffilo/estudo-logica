package controller;

import util.Teclado;

public class questao03 {

	public static void main(String[] args) {

		double num1, num2;
		
		num1 = Teclado.lerDouble("Informe um n�mero real.");
		num2 = Teclado.lerDouble("Informe mais um n�mero real.");
		
		System.out.println("O primeiro valor + 30% � igual �: " + num1 * 1.3);
		System.out.println("O segundo valor - 25% � igual �: " + num2 * 0.75);
	}

}
