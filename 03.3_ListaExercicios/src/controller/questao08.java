package controller;

import util.Teclado;

public class questao08 {

	public static void main(String[] args) {

		double base, altura;
		
		base = Teclado.lerDouble("Informe o tamanho da base do retângulo em centímetros.");
		altura = Teclado.lerDouble("Informe a altura do retângulo em centímetros.");
		
		System.out.println("O perímetro deste retângulo é: " + (base+altura) + "cm.");
		System.out.println("A àrea deste retângulo é: " + (base*altura) + "cm².");
		System.out.println("A diagonal/hipotenusa deste retângulo é: " + Math.sqrt (Math.pow(base, 2) + Math.pow(altura, 2)) + "cm.");
		
	}

}
