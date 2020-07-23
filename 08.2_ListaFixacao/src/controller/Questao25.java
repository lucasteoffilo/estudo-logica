package controller;

import util.Teclado;

public class Questao25 {

	public static void main(String[] args) {
		/*
		 * 25) Uma vila de casas possui 8 casas, sendo que a numeração das casas inicia
		 * pela casa 8 e as demais casas possuem números sequenciais acrescidos de 10
		 * (8, 18, 28... até 78). Elabore uma matriz 8 x 12 do tipo lógico (em java:
		 * boolean) onde as linhas da matriz correspondam às 8 casas da vila, e as
		 * colunas correspondam aos 12 meses de um ano. Esta matriz irá armazenar a
		 * situação de pagamento de condomínio das casas da vila durante o ano. Faça
		 * então uma rotina onde será questionada se as casas pagaram suas taxas de
		 * condomínio mensais. As perguntas na tela devem ser assim: A casa 8 pagou o
		 * condomínio do mês 1? (S ou N); A casa 8 pagou o condomínio do mês 2? (S ou
		 * N); ... ; A casa 38 pagou o condomínio do mês 10? (S ou N). Quando o usuário
		 * digitar S será inserido true (Verdadeiro) na matriz. Quando o usuário digitar
		 * N será inserido false (Falso) na matriz. Ao final, deverá ser exibido na tela
		 * um relatório de uma forma que seja compreensível visualmente a situação
		 * condominial de toda a vila naquele ano.
		 */

		int a[][] = new int[8][13];

		// inserindo número das casas
		for (int i = 0; i < 8;) {
			for (int j = 8; j < 80; j = j + 10) {
				a[i][0] = j;
				i++;
			}

		}
		// perguntando
		// 1 para sim e 0 para não
		for (int i = 0; i < 8; i++) {
			for (int j = 1; j < 13; j++) {
				String b = Teclado.lerTexto("A casa " + a[i][j - j] + " pagou o condomínio do mês " + j + " ?");
				if (b.equals("sim") || b.equals("s") || b.equals("Sim") || b.equals("S")) {
					a[i][j] = 1;
				} else {
					a[i][j] = 0;
				}
			}
		}

		// exibindo relátorio
		System.out.println("                                    Relátorio Anual do Condomínio");
		System.out.println(
				"  Casa    | Mês 1 || Mês 2 || Mês 3 || Mês 4 || Mês 5 || Mês 6 || Mês 7 || Mês 8 || Mês 9 || Mês 10 || Mês 11 || Mês 12 |");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 12; j++) {
				switch (a[i][j]) {

				case 0:
				case 1:
					break;
				default:
					System.out.print("   " + a[i][j] + "       ");
				}
				switch (a[i][j + 1]) {

				case 1:
					System.out.print("|  PG   |");
					break;
				default:
					System.out.print("|  NPG  |");
				}
			}
			System.out.println("");
		}

	}

}
