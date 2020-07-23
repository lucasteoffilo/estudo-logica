package controller;

import util.Teclado;

public class Questao13 {

	public static void main(String[] args) {

		/*
		 * A seleção brasileira de futebol da Copa do Mundo FIFA 2014 teve a sua
		 * escalação conforme a tabela abaixo. Crie um vetor e armazene esta escalação.
		 * Em seguida, enquanto o usuário digitar o número correspondente à camisa de um
		 * jogador o nome do jogador deverá aparecer. Quando o usuário digitar um número
		 * que não corresponda a um jogador, deverá surgir a informação “Este número não
		 * corresponde a um jogador escalado”, e então o programa será encerrado.
		 */

		String time[] = { "", "Jefferson", "Daniel Alves", "Thiago Silva", "David Luiz", "Fernandinho", "Marcelo",
				"Hulk", "Paulinho", "Fred", "Neymar JR", "Oscar", "Julio César", "Dante", "Maxwell", "Henrique",
				"Ramires", "Luiz Gustavo", "Hernanes", "Willian", "Bernard", "Jô", "Victor", "Maicon" };

		int a = Teclado.lerInt("Digite um número de 1 à 23 para pesquisar um jogador pela camisa.");

		if (a > 0 && a < time.length) {
			System.out.println(time[a]);
		} else {
			System.out.println("Este número não corresponde a um jogador escalado.");
		}
	}

}
