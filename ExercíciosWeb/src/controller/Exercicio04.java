package controller;

import util.Teclado;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Um banco concederá um crédito especial aos seus clientes, variável com o
		 * saldo médio no último ano. Faça um algoritmo que leia o saldo médio de um
		 * cliente e calcule o valor do crédito de acordo com a tabela abaixo. Mostre
		 * uma mensagem informando o saldo médio e o valor do crédito. 
		 * Saldo médio Percentual de 0 a 200 nenhum crédito 
		 * de 201 a 400 20% do valor do saldo médio 
		 * de 401 a 600 30% do valor do saldo médio 
		 * acima de 601 40% do valor do saldo médio
		 */

		double saldoAnual = 0, saldoMed, cred = 0, credDisp;

		saldoAnual = Teclado.lerDouble("Qual foi seu saldo anual no último ano?");
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
		System.out.println("Seu saldo médio no ultimo ano: R$" + saldoMed);
		System.out.println("Crédito disponivel: R$" + credDisp);

	}

}
