package controller;

import util.Teclado;

public class questao05 {

	public static void main(String[] args) {

		double salario, aumento;
		salario = Teclado.lerDouble("Insira o valor do seu sal�rio para calcular seu aumento.");
		aumento = (salario*15)/100;
				
		System.out.println("O valor do seu aumento �: R$"+aumento);
		System.out.println("O valor do seu sal�rio com aumento de 15% � de: R$"+(salario+aumento));
	}

}
