package controller;

import util.Teclado;

public class Questao15 {

	/*
	 * Fazer um algoritmo que pergunte o nome do aluno, e as notas das provas 1 e 2.
	 * Dever� ser exibida na tela como resposta a m�dia do aluno, e se ele est�
	 * aprovado, reprovado ou em prova final. Estas condi��es devem seguir as regras
	 * da tabela abaixo:
	 * 
	 */
	public static void main(String[] args) {

		String nome, sit;
		double nota1, nota2, med;

		nome = Teclado.lerTexto("Nome do aluno: ");
		nota1 = Teclado.lerDouble("Informe a nota da 1� prova.");
		nota2 = Teclado.lerDouble("Informe a nota da 2� prova.");

		med = (nota1 + nota2) / 2;

		if (med < 3) {
			sit = "Reprovado";
			System.out.println(nome);
			System.out.println("M�dia = " + med);
			System.out.println(sit);
		} else {
			if (med >= 3 && med <= 6.9) {
				sit = "Prova Final";
				System.out.println(nome);
				System.out.println("M�dia = " + med);
				System.out.println(sit);
			} else {
				if (med > 7) {
					sit = "Aprovado";
					System.out.println(nome);
					System.out.println("M�dia = " + med);
					System.out.println(sit);

				}
			}
		}
	}

}
