package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {

		int num1, num2;
		num1 = Teclado.lerInt("Informe um número.");
		num2 = Teclado.lerInt("Informe outro número.");
		if (num1 > num2) {
			System.out.println("A diferença entre " + num1 + " e " + num2 + " é :" + (num1 - num2));
		} else {
			System.out.println("A diferença entre " + num2 + " e " + num1 + " é : " + (num2 - num1));
		}
	}

}
