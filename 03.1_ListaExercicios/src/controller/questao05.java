package controller;

import util.Teclado;

public class questao05 {

	public static void main(String[] args) {

		double salario, aumento;
		salario = Teclado.lerDouble("Insira o valor do seu salário para calcular seu aumento.");
		aumento = (salario*15)/100;
				
		System.out.println("O valor do seu aumento é: R$"+aumento);
		System.out.println("O valor do seu salário com aumento de 15% é de: R$"+(salario+aumento));
	}

}
