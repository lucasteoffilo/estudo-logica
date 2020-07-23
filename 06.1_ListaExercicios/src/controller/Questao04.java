package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {

		String a;

		a = Teclado.lerTexto("Informe a sigla do seu estado.");

		switch (a) {

		case "RJ":
			System.out.println("Carioca");
			break;
		case "rj":
			System.out.println("Carioca");
			break;
		case "SP":
			System.out.println("Paulista");
			break;
		case "sp":
			System.out.println("Paulista");
			break;
		case "MG":
			System.out.println("Mineiro");
			break;
		case "mg":
			System.out.println("Mineiro");
			break;
		default:
			System.out.println("Outros estados.");

		}
	}

}
