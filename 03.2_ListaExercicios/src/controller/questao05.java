package controller;

import util.Teclado;

public class questao05 {

	public static void main(String[] args) {

		double num1, num2;
		
		num1 = Teclado.lerDouble("Infome um n�mero");
		num2 = Teclado.lerDouble("Informe outro n�mero");

		System.out.println("A soma dos dois n�meros �: "+(num1+num2));
		System.out.println("A subtra��o do primeiro pelo segundo n�mero �: "+ (num1 - num2));
		System.out.println("A subtra��o do segundo pelo primeiro n�mero �: "+ (num2 - num1));
		System.out.println("A multiplica��o dos dois n�meros �: "+ num1*num2);
		System.out.println("A divis�o do primeiro pelo segundo n�mero �: "+ num1/num2);	//Resto da divis�o
		System.out.println("O resto da divis�o do primeiro pelo segundo n�mero �: "+ (num1%num2)); 
		 
		 
	}

}
