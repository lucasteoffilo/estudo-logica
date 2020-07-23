package controller;

import util.Teclado;

public class questao09 {

	public static void main(String[] args) {

		int age, month, days;
		
		age = Teclado.lerInt("Informe sua idade em anos");
		month = Teclado.lerInt("Agora informe quantos meses");
		days = Teclado.lerInt("Agora informe quantos dias");
		
		System.out.println("Sua idade expressa em dias é igual a: "+ ((age*365)+(month*30)+days));
	}

}
