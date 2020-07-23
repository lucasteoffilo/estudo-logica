package controller;

import util.Teclado;

public class MultiplaEscolha {
	public static void main(String[] args) {
		int mat, ultimo;
		mat = Teclado.lerInt("Informe seu número de matrícula");
		ultimo = mat % 10;
		switch (ultimo) {
		case 0:
			System.out.println("Pagamento em Janeiro");
			break;
		case 1:
			System.out.println("Pagamento em Fevereiro");
			break;
		case 2:
			System.out.println("Pagamento em Março");
			break;
		case 3:
			System.out.println("Pagamento em Abril");
			break;
		default:
			System.out.println("Pagamento em Maio");
		}
	}
}