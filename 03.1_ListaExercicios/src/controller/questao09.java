package controller;

import util.Teclado;

public class questao09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, quadrado, raiz;
		num1 = Teclado.lerDouble("Informe um número");
		quadrado = Math.pow(num1,2);
		raiz = Math.sqrt(num1);
		
		System.out.println("O número informado foi o: "+num1);
		System.out.println("Este número elevado a ² é igual à: "+quadrado);
		System.out.println("E sua raiz quadrada é: "+raiz);
		
	}

}
