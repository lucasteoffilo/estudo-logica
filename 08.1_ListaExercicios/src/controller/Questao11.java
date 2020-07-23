package controller;

import util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
		/*
		 * Um distribuidor de refrigerantes vende seu produto em todas as 5 regiões do
		 * Brasil. Em cada trimestre do ano ele fecha a totalização de vendas por região
		 * montando uma tabela que cruza região x total de vendas no trimestre.
		 * Desenvolver um programa que leia o total de vendas em cada região por
		 * trimestre, e ao final, apresente na tela um relatório com informações de
		 * vendas por região em cada trimestre, além do total de vendas no ano inteiro
		 * também por cada região e total geral de vendas no ano pela empresa.
		 */

		System.out.println("Legenda de Regiões do Brasil");
		System.out.println("1  -  Norte");
		System.out.println("2  -  Nordeste");
		System.out.println("3  -  Centro-Oeste");
		System.out.println("4  -  Sudeste");
		System.out.println("5  -  Sul");

		double a[][] = new double[5][3];
		double b[] = new double[5];
		double c = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = Teclado.lerDouble(
						"Informe o total de vendas da região " + (i + 1) + " do " + (j + 1) + "º trimestre.");
				b[i] = b[i] + a[i][j];
				c = c + a[i][j];
			}
		}
		System.out.println("Região      ---   1º Tri   ---   2º Tri   ---   3º Tri   ---   Total");
		for (int i = 0; i < a.length; i++) {
			System.out.print("Região: " + (i + 1) + "   ---");

			for (int j = 0; j < a[0].length; j++) {
				System.out.print("   " + a[i][j] + "     ---");
			}
			System.out.print("   " + b[i]);
			System.out.println("");
		}
		System.out.println("Total Geral = " + c);

	}

}