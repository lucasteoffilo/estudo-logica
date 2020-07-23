package controller;

import util.Teclado;

public class Questao11B {

	public static void main(String[] args) {

		double num, resto, centena;
		num = Teclado.lerInt("Informe o número de 3 casas. (Entre 100 e 999)");
		resto = num % 100;
		centena = (num - resto) / 100;

		System.out.println("A centena de " + num + " é = " + centena);

	}

}
