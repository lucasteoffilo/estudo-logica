package controller;

import util.Teclado;

public class questao08 {

	public static void main(String[] args) {

		double base, altura;
		
		base = Teclado.lerDouble("Informe o tamanho da base do ret�ngulo em cent�metros.");
		altura = Teclado.lerDouble("Informe a altura do ret�ngulo em cent�metros.");
		
		System.out.println("O per�metro deste ret�ngulo �: " + (base+altura) + "cm.");
		System.out.println("A �rea deste ret�ngulo �: " + (base*altura) + "cm�.");
		System.out.println("A diagonal/hipotenusa deste ret�ngulo �: " + Math.sqrt (Math.pow(base, 2) + Math.pow(altura, 2)) + "cm.");
		
	}

}
