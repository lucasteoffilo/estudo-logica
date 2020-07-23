package controller;

import util.Teclado;

public class Questao12 {

	/*
	 * Desenvolver um programa que peça ao usuário para digitar diversos números
	 * reais, e ao final, exibir o maior e o menor número que foram digitados, além
	 * da média entre TODOS os números digitados pelo usuário. A inserção de números
	 * deve parar quando o usuário digitar o número -1, e este número -1 não deve
	 * ser considerado nem como maior, nem como menor, e nem na contagem da média.
	 */
	public static void main(String[] args) {

		double num = 0, maior, menor, soma = num, cont = 0, med;

		num = Teclado.lerDouble("Informe um n�mero. (-1 encerra o programa.)");

		if (num != -1) {

			maior = num;
			menor = num;

			while (num != -1) {

				if (maior < num) {
					maior = num;
				}
				if (menor > num) {
					menor = num;
				}

				soma = soma + num;
				cont++;

				num = Teclado.lerDouble("Informe um n�mero. (-1 encerra o programa.)");

			}

			System.out.println("Maior n�mero: " + maior);
			System.out.println("Menor n�mero: " + menor);
			med = soma / cont;
			System.out.println("M�dia: " + med);
		} else {
			System.out.println("Voc� digitou -1 e encerrou o programa.");
		}
	}
}
