package controller;

import util.Teclado;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Um banco conceder� um cr�dito especial aos seus clientes, vari�vel com o
		 * saldo m�dio no �ltimo ano. Fa�a um algoritmo que leia o saldo m�dio de um
		 * cliente e calcule o valor do cr�dito de acordo com a tabela abaixo. Mostre
		 * uma mensagem informando o saldo m�dio e o valor do cr�dito. 
		 * Saldo m�dio Percentual de 0 a 200 nenhum cr�dito 
		 * de 201 a 400 20% do valor do saldo m�dio 
		 * de 401 a 600 30% do valor do saldo m�dio 
		 * acima de 601 40% do valor do saldo m�dio
		 */

		double saldoAnual = 0, saldoMed, cred = 0, credDisp;

		saldoAnual = Teclado.lerDouble("Qual foi seu saldo anual no �ltimo ano?");
		saldoMed = saldoAnual / 12;

		if (saldoMed >= 0 && saldoMed <= 200) {
			cred = 0;
		} else {
			if (saldoMed >= 200 && saldoMed <= 400) {
				cred = 0.2;
			} else {
				if (saldoMed > 400 && saldoMed <= 600) {
					cred = 0.3;
				} else {
					if (saldoMed >= 601) {
						cred = 0.4;
					}
				}
			}
		}
		credDisp = saldoMed * cred;
		System.out.println("Seu saldo m�dio no ultimo ano: R$" + saldoMed);
		System.out.println("Cr�dito disponivel: R$" + credDisp);

	}

}
