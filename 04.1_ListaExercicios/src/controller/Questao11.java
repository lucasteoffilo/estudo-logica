package controller;

import util.Teclado;

public class Questao11 {

	/* Desenvolver um programa que pergunte um n�mero de 3 casas
	 * e apresente como resultado somente o algarismo das centenas.
	 */
	
	public static void main(String[] args) {

		int num;
		num = Teclado.lerInt("Informe o n�mero de 3 casas. (Entre 100 e 999)");

		if (num >= 100) {
			System.out.println("A centena de " + num + " � = " + num / 100);
		} else {
			System.out.println(num + " N�o possui centenas.");
			
		}
	}

}
