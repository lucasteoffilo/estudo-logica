package controller;

import util.Teclado;

public class questao09 {

	public static void main(String[] args) {

			int t, r;
			t = Teclado.lerInt("Informe o valor do 1� termo.");
			r = Teclado.lerInt("Informe o valor da raz�o.");
						
			System.out.println("O valor do 10� termo �: " + ((r*9) + t));
	
	}

}
