package controller;

import util.Teclado;

public class Questao13B {

	public static void main(String[] args) {

		int a, b, c, aux;
		a = Teclado.lerInt("Informe um número."); // 3
		b = Teclado.lerInt("Informe outro número."); // 2
		c = Teclado.lerInt("Informe outro número."); // 1


		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		if (a > c) {
			aux = a;
			a = c;
			c = aux;
		}
		
		if (b > c) {
			aux = b;
			b = c;
			c = aux;
		}
	
		System.out.println("1º = " + a);
		System.out.println("2º = " + b);
		System.out.println("3º = " + c);
	



	}

}
