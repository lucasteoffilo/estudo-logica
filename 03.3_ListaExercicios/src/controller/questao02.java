package controller;

import util.Teclado;

public class questao02 {

	public static void main(String[] args) {

		double horaAula, horasTrab, inss, liq, desconto;
		
		inss = Teclado.lerDouble("Informe o valor de desconto do INSS.");
		horaAula = Teclado.lerDouble("Informe o valor da Hora/Aula.");
		horasTrab = Teclado.lerDouble("Informe o n�mero de horas trabalhadas no m�s.");
		
		desconto = (horaAula * horasTrab) * inss /100;
		liq = (horaAula * horasTrab) - desconto;
		
		System.out.println("Seu sal�rio l�quido deste m�s �: R$" + liq);
		System.out.println("O valor de desconto do INSS foi de: R$" + desconto);
		
	}

}
