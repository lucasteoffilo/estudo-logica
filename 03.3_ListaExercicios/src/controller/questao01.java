package controller;

import util.Teclado;

public class questao01 {

	protected static void main(String[] args) {

		double area, raio, pi;
		
		pi = 3.14159265;
		raio = Teclado.lerDouble("Insira a medida de Raio do círculo em centímetros.");
		area = Math.pow(raio, 2) * pi;
		
		System.out.println("A àrea do círculo em questão é: " + area + "cm².");
	}

}
