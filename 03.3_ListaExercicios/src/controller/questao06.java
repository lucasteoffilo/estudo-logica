package controller;

import util.Teclado;

public class questao06 {

	public static void main(String[] args) {

		double a, b;
		
		a = Teclado.lerDouble("Informe um valor para A.");
		b = Teclado.lerDouble("Insira um valor para B.");
				
		System.out.println("O valor de A é: " + (a-a+b));
		System.out.println("O valor de B é: " + (b-b+a));
	}

}
