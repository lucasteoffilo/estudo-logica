package controller;

import util.Teclado;

public class questao04 {

	public static void main(String[] args) {

		double num1, peso1, num2, peso2, num3, peso3, num4, peso4, mp1, mp2, mp3, mp4;
		
		num1 = Teclado.lerDouble("Informe um número.");
		peso1 = Teclado.lerDouble("Informe o seu peso.");
		num2 = Teclado.lerDouble("Informe um número.");
		peso2 = Teclado.lerDouble("Informe o seu peso.");
		num3 = Teclado.lerDouble("Informe um número.");
		peso3 = Teclado.lerDouble("Informe o seu peso.");
		num4 = Teclado.lerDouble("Informe um número.");
		peso4 = Teclado.lerDouble("Informe o seu peso.");
		mp1 = ( (num1 * peso1) + (num1 * peso1) + (num1 * peso1) + (num1 * peso1) ) / (peso1 + peso2 + peso3 + peso4);
		mp2 = ( (num2 * peso2) + (num2 * peso2) + (num2 * peso2) + (num2 * peso2) ) / (peso1 + peso2 + peso3 + peso4);
		mp3 = ( (num3 * peso3) + (num3 * peso3) + (num3 * peso3) + (num3 * peso3) ) / (peso1 + peso2 + peso3 + peso4);
		mp4 = ( (num4 * peso4) + (num4 * peso4) + (num4 * peso4) + (num4 * peso4) ) / (peso1 + peso2 + peso3 + peso4);
		
		System.out.println("Média aritmética podenrada (MP1) = "+ mp1);
		System.out.println("Média aritmética podenrada (MP2) = "+ mp2);
		System.out.println("Média aritmética podenrada (MP3) = "+ mp3);
		System.out.println("Média aritmética podenrada (MP4) = "+ mp4);
	}

}
