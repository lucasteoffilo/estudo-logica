package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {

		String sexo;

		sexo = Teclado.lerTexto("Informe o sexo. 'F' para feminino e 'M' para masculino.");

		switch (sexo) {

		case "m":
		case "M":
			System.out.println("Banheiro masculino à direita.");
			break;
		case "f":
			System.out.println("Banheiro feminino à esquerda.");
			break;
		case "F":
			System.out.println("Banheiro feminino à esquerda.");
			break;
		default:
			System.out.println("Erro.");
		}
	}

}
