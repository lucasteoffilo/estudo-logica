package controller;

import util.Teclado;

public class questao07 {

	public static void main(String[] args) {

		double cateto1, cateto2, hipo;
		
		cateto1 = Teclado.lerDouble("Informe o valor do primeiro cateto.");
		cateto2 = Teclado.lerDouble("Informe o valor do segundo cateto.");
		hipo = Math.sqrt (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		System.out.println("O valor da hipotenusa é: " + hipo);
		
	}

}
