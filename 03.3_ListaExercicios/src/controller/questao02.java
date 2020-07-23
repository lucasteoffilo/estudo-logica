package controller;

import util.Teclado;

public class questao02 {

	public static void main(String[] args) {

		double horaAula, horasTrab, inss, liq, desconto;
		
		inss = Teclado.lerDouble("Informe o valor de desconto do INSS.");
		horaAula = Teclado.lerDouble("Informe o valor da Hora/Aula.");
		horasTrab = Teclado.lerDouble("Informe o número de horas trabalhadas no mês.");
		
		desconto = (horaAula * horasTrab) * inss /100;
		liq = (horaAula * horasTrab) - desconto;
		
		System.out.println("Seu salário líquido deste mês é: R$" + liq);
		System.out.println("O valor de desconto do INSS foi de: R$" + desconto);
		
	}

}
