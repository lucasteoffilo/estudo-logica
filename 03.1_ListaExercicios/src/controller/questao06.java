package controller;

import util.Teclado;

public class questao06 {
	public static void main(String[] args) {
		
		double c, f;
		
		f = Teclado.lerDouble("Insira a temperatura em Fahrenheit");
		c = (f-32)*5/9;
		
		System.out.println(f+"º Fahrenheit é igual a: "+c+"º Celsius.");
	}

}
