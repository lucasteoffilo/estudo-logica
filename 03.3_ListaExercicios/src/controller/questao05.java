package controller;

import util.Teclado;

public class questao05 {

	public static void main(String[] args) {

		double volume, pi, raio, altura;
		
		pi = 3.14159265;
		raio = Teclado.lerDouble("Informe a medida de raio da lata em cent�metros.");
		altura = Teclado.lerDouble("Informe a altura da lata em cent�metros.");
		volume = Math.pow(raio, 2) * (pi) * altura;
		
		System.out.println("O volume desta lata �: " + volume + " cm�.");
				
	}

}
