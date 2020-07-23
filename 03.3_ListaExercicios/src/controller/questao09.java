package controller;

import util.Teclado;

public class questao09 {

	public static void main(String[] args) {

			int t, r;
			t = Teclado.lerInt("Informe o valor do 1º termo.");
			r = Teclado.lerInt("Informe o valor da razão.");
						
			System.out.println("O valor do 10º termo é: " + ((r*9) + t));
	
	}

}
