package controller;

import util.Teclado;

public class Questao05B {

	public static void main(String[] args) {

		double num, a, b, c, aux;

		do { 
		num = Teclado.lerInt("Informe um número de 3 dígitos.");
		} while (num < 100 || num > 999);
			
		aux = num % 100;
		a = (num - aux) / 100;
		c = (aux % 10);
		b = (aux - c) / 10;

		num = (c * 100) + (b * 10) + a;
		System.out.println(num);
	}

}
