package controller;

import util.Teclado;

public class questao09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, quadrado, raiz;
		num1 = Teclado.lerDouble("Informe um n�mero");
		quadrado = Math.pow(num1,2);
		raiz = Math.sqrt(num1);
		
		System.out.println("O n�mero informado foi o: "+num1);
		System.out.println("Este n�mero elevado a � � igual �: "+quadrado);
		System.out.println("E sua raiz quadrada �: "+raiz);
		
	}

}
