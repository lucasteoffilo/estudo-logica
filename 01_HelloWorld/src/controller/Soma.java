package controller;

import util.Teclado;

public class Soma {

	public static void main(String[] args) {
	
		// Variable
		int num1, num2, resp;
				// Entrada de teclado + Leitura de número inteiro
		num1 = Teclado.lerInt("Por favor, informe um número:");
				// Segunda entrada do usuário
		num2 = Teclado.lerInt("Por favor, informe outro número");
		
		resp = num1 + num2;
		
		// O simbolo "+" está unindo o texto à váriavel. Isto se chama CONCATENAR.
		System.out.println("O resultado da soma é: " + resp);
		
		
		

	}

}
