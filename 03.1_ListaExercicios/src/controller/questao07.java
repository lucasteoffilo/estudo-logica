package controller;

import util.Teclado;

public class questao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, num3, media;
		
		num1 = Teclado.lerDouble("Insira sua 1º nota");
		num2 = Teclado.lerDouble("Insira sua 2º nota");
		num3 = Teclado.lerDouble("Insira sua 3º nota");
		media = (num1+num2+num3)/3;
				
		System.out.println("A sua média é: "+media);
	}

}
