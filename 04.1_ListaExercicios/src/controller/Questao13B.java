package controller;

import util.Teclado;

public class Questao13B {

	public static void main(String[] args) {

		int a, b, c, aux;
		a = Teclado.lerInt("Informe um n�mero."); // 3
		b = Teclado.lerInt("Informe outro n�mero."); // 2
		c = Teclado.lerInt("Informe outro n�mero."); // 1


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
	
		System.out.println("1� = " + a);
		System.out.println("2� = " + b);
		System.out.println("3� = " + c);
	



	}

}
