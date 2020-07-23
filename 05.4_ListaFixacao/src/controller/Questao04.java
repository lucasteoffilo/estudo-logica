package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {

		/* Fazer um algoritmo que pergunte o valor de um produto à venda e qual a
		 * porcentagem de desconto a ser da da pelo vendedor. O algoritmo deverá
		 * informar como resposta o valor final do produto (já com desconto).
		 */
		
		double vp, d, i;
		String a;
		do {
			
		i = 0;
		vp = Teclado.lerDouble("Informe o valor do produto.");
		d = Teclado.lerDouble("Informe o desconto.");
		
		System.out.println("O produto com " + d + "% de desconto = R$" + ((vp*d)/100 - vp) * -1);
		a = Teclado.lerTexto("Para continuar digite 's' ou 'n' para parar.");
		if (a.equals("s")) {
			i = 1;
		}
		} while (i > 0);
		
	}

}
