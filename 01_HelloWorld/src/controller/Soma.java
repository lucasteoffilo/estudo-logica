package controller;

import util.Teclado;

public class Soma {

	public static void main(String[] args) {
	
		// Variable
		int num1, num2, resp;
				// Entrada de teclado + Leitura de n�mero inteiro
		num1 = Teclado.lerInt("Por favor, informe um n�mero:");
				// Segunda entrada do usu�rio
		num2 = Teclado.lerInt("Por favor, informe outro n�mero");
		
		resp = num1 + num2;
		
		// O simbolo "+" est� unindo o texto � v�riavel. Isto se chama CONCATENAR.
		System.out.println("O resultado da soma �: " + resp);
		
		
		

	}

}
