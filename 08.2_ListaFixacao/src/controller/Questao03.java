package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {

		/*
		 * Desenvolver um programa que exiba um menu com todos os signos do zodíaco
		 * conforme a tabela 1 abaixo, e peça ao usuário para escolher o número
		 * correspondente a um signo do menu. O programa então deverá exibir na tela o
		 * período de vigência do signo de acordo com a tabela 2 abaixo. (OBS: A tabela
		 * 2 não deve aparecer inteira para o usuário. Apenas o período de acordo com a
		 * opção escolhida pelo usuário)
		 */

		System.out.print("Código - Signo   ");
		System.out.println("\n 1   -   Capricórnio   ");
		System.out.println(" 2    -   Aquário   ");
		System.out.println(" 3    -   Peixes   ");
		System.out.println(" 4    -   Áries   ");
		System.out.println(" 5    -   Touro   ");
		System.out.println(" 6    -   Gêmeos   ");
		System.out.println(" 7    -   Câncer   ");
		System.out.println(" 8    -   Leão   ");
		System.out.println(" 9    -   Virgem   ");
		System.out.println(" 10   -   Libra   ");
		System.out.println(" 11   -   Escorpião   ");
		System.out.println(" 12   -   Sagitário   ");

		int a;

		a = Teclado.lerInt("Informe um número correspondente a um signo acima.");

		switch (a) {

		case 1:
			System.out.println("	Signo    -	  Período  ");
			System.out.println(" Capricórnio - 22/12 a 21/01");
			break;
		case 2:
			System.out.println("	Signo    -	  Período  ");
			System.out.println("   Aquário   -  22/01 a 18/02");
			break;
		case 3:
			System.out.println("	Signo    -	  Período  ");
			System.out.println("    Peixes   -  19/02 a 19/03");
			break;
		case 4:
			System.out.println("	Signo    -	  Período  ");
			System.out.println("    Áries    -  20/03 a 20/04");
			break;
		case 5:
			System.out.println("	Signo    -	  Período  ");
			System.out.println("    Touro    -  21/04 a 20/05");
			break;
		case 6:
			System.out.println("	Signo    -	  Período  ");
			System.out.println("    Gêmeos   -  21/05 a 20/06");
			break;
		case 7:
			System.out.println("	Signo    -	  Período  ");
			System.out.println("    Câncer   -  21/06 a 21/07");
			break;
		case 8:
			System.out.println("	Signo    -	  Período  ");
			System.out.println("    Leão     -  22/07 a 22/08");
			break;
		case 9:
			System.out.println("	Signo    -	  Período  ");
			System.out.println("   Virgem    -  23/08 a 22/09");
			break;
		case 10:
			System.out.println("	Signo    -	  Período  ");
			System.out.println("    Libra    -  23/09 a 22/10");
			break;
		case 11:
			System.out.println("	Signo    -	  Período  ");
			System.out.println("  Escorpião  -  23/10 a 21/11");
			break;
		case 12:
			System.out.println("	Signo    -	  Período  ");
			System.out.println("  Sagitário  -  22/11 a 21/12");
			break;
		default:
			System.out.println("Número informado não existe na tabela.");

		}

	}

}
