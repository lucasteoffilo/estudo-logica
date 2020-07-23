package controller;

import util.Teclado;

public class questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, sucessor, antecessor;
		
		num1 = Teclado.lerInt("Digite um número inteiro.");
		sucessor = num1 + 1;
		antecessor = num1 - 1;
		
		System.out.println("O seu antecessor é o número: "+antecessor+", e o seu sucessor é o número: "+sucessor+".");

	}

}
