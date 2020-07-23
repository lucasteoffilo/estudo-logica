package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {

		System.out.println("Menu de opções");
		System.out.println("1 - Incluir");
		System.out.println("2 - Alterar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Pesquisar");
		System.out.println("5 - Sair");

		int op;

		op = Teclado.lerInt("Insira sua opção.");

		switch (op) {

		case 1:
			System.out.println("Incluir Confirmado.");
			break;
		case 2:
			System.out.println("Alterar Confirmado.");
			break;
		case 3:
			System.out.println("Incluir Confirmado.");
			break;
		case 4:
			System.out.println("Pesquisar Confirmado.");
			break;
		case 5:
			System.out.println("Sair Confirmado.");
			break;
		default:
			System.out.println("O número digitado não existe no menu de opções");

		}

	}

}
